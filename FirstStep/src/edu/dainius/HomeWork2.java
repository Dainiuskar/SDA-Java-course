package edu.dainius;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        swapsValues(3, 7);
        greaterValue();
        leapYear();
        secondSmallest();

        int forTest[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int printNewMas[] = insertAnotherInt(forTest, 99, 3);
        printMas(printNewMas);

        int iab[] = integerAtStart(forTest, 99);
        printMas(iab);

        int iae[] = integerAtEnd(forTest, 99);
        printMas(iae);

        int rai[] = removeArrayIndex(forTest, 3);
        printMas(rai);

        int rfi[] = removeFirstIndex(forTest);
        printMas(rfi);

        int rli[] = removeLastIndex(forTest);
        printMas(rli);

    }

    private static void swapsValues(int a, int b) {

        System.out.printf("\nValue a:%s value b:%s", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("\nSwapped value a:%s value b:%s", a, b);
    }

    private static void greaterValue() {

        int a = 7;
        int b = 9;
        if (a > b) {
            System.out.println("\nA is greater than B");
        } else {
            System.out.println("\nA is not greater than B");
        }
    }

    private static void leapYear() {

        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year");
        int theYear = year.nextInt();

        if (((theYear % 4 == 0) && (theYear % 100 != 0)) || theYear % 400 == 0) {
            System.out.println("Is leap year");
        } else {
            System.out.println("not leap year");
        }

    }

    private static void secondSmallest() {

        int[] numbers = {1, 5, 7, 2, 3, 6, 9, 10, 0, 10, 10, 11, 10, 5, 1, 5, 1, 0, -5, -21, 1, 0, 0, 3, -3, 3, -20};
        findNumber(numbers);
    }

    private static void findNumber(int[] mas) {

        int smallest = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < smallest) {
                smallest = mas[i];
            }
        }

        int smallest2 = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > smallest && mas[i] < smallest2) {
                smallest2 = mas[i];
            }
        }
        System.out.println("Second smallest: " + smallest2);
    }

    private static int[] insertAnotherInt(int[] mas, int newNumber, int masIndex) {

        int[] newMas = new int[mas.length + 1];
        int[] newMas2 = new int[mas.length + 1];
        int j = 0;

        for (int i = 0; i < mas.length; i++) {
            newMas[i] = mas[i];
        }

        for (int i = 0; i < newMas.length; i++) {
            if (i != masIndex) {
                newMas2[i] = newMas[j++];
            } else {
                newMas2[i] = newNumber;
            }
        }
        return newMas2;

    }

    private static int[] integerAtStart(int mas[], int newNumber) {

        int[] newMas = new int[mas.length + 1];
        int j = 0;
        newMas[0] = newNumber;

        for (int i = 1; i < newMas.length; i++) {
            newMas[i] = mas[j++];
        }
        return newMas;
    }

    private static void printMas(int mas[]) {

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println("\n");
    }

    private static int[] integerAtEnd(int mas[], int newNumber) {

        int[] newMas = new int[mas.length + 1];
        int end = newMas.length;
        newMas[end - 1] = newNumber;

        for (int i = 0; i < newMas.length - 1; i++) {
            newMas[i] = mas[i];
        }
        return newMas;
    }

    private static int[] removeArrayIndex(int[] mas, int masIndex) {

        int[] newMas = new int[mas.length - 1];
        int j = 0;
        int k = 0;

        for (int i = 0; i < mas.length; i++) {
            if (i != masIndex) {
                newMas[k++] = mas[j++];
            } else {
                j++;
            }
        }
        return newMas;

    }

    private static int[] removeFirstIndex(int[] mas) {

        int result[] = new int[mas.length - 1];
        int j = 0;

        for (int i = 1; i < mas.length; i++) {
            result[j++] = mas[i];
        }
        return result;
    }

    private static int[] removeLastIndex(int[] mas) {

        int result[] = new int[mas.length - 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = mas[i];
        }
        return result;
    }

}
