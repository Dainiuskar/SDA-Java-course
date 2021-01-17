package edu.dainius.classroom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Solution {

    public String dayOfTheWeek(int day, int month, int year) {

        String dateString = String.format("%d-%d-%d", year, month, day);
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

        return dayOfWeek;
    }

    public int distributeCandies(int[] candies) {

        int[] mas = new int[candies.length];
        int j = 1;
        int n = 0;
        int m = 1;
        int kind = 0;

        for (int i = 0; i < candies.length - 1; i++) {
            if (candies[i] == candies[j]) {
                kind = kind + 1;
                mas[n++] = candies[j];
                mas[candies.length - (m++)] = candies[i];
                j = j + 2;
                i = i + 1;

            } else {
                mas[n++] = candies[i];
                mas[n++] = candies[j];
                j = j + 2;
                i = i + 1;
            }
        }
        return kind;
    }

    public int MinimumDeletionCost(String s, int[] cost) {

        String[] stringResult = s.split("");
        int sumOfMinimalCost = 0;
        int j = 1;
        int u = 0;
        int sameCharAmount = 0;
        //Counting how many equals letters
        for (int i = 0; i < stringResult.length-1; i++) {
            if (stringResult[i].equals(stringResult[j]) ) {
                sameCharAmount += 1;
            }
            j++;
        }
        //sorting cost array
        for (int i = 0; i < sameCharAmount; i++) {
            j=1;
            for (int k = 0; k < stringResult.length-1; k++) {
                if (!stringResult[k].equals(stringResult[j]) ) {
                    stringResult[k] = stringResult[k];
                    j++;
                } else {
                    if (cost[k] < cost[j]) {
                        stringResult[k] = stringResult[k];
                        j++;
                    } else {
                        String temp = stringResult[k];
                        int temp1 = cost[k];
                        stringResult[k] = stringResult[j];
                        stringResult[j] = temp;
                        cost[k] = cost[j];
                        cost[j] = temp1;
                        j++;
                    }
                }
            }
        }

        //Finding indexes to delete
        j=1;
        int[] indexesToDelete = new int[(sameCharAmount+1)];
        indexesToDelete[indexesToDelete.length-1]= -1;
        for (int i = 0; i < stringResult.length-1; i++) {
            if (stringResult[i].equals(stringResult[j]) ) {
                indexesToDelete[u++] = i;
                sumOfMinimalCost += cost[i];
            }
            j++;
        }

        //deleting string and cost arrays
        j=0;
        u=0;
        String[] finalResultString = new String[(stringResult.length - sameCharAmount)];
        int[] finalResultInt = new int[(stringResult.length - sameCharAmount)];
        for (int i=0; i<cost.length; i++){
            if (indexesToDelete[j] != i){
                finalResultInt[u] = cost[i];
                finalResultString[u++] = stringResult[i];
            }else {
                j++;
            }
        }




        return sumOfMinimalCost;
    }
}

