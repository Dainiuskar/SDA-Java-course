package edu.dainius;

import java.util.Scanner;
import static java.lang.Math.*;

public class HomeWork {

    public static void main(String[] args) {

        secondTaskA();
        secondTaskB();
        secondTaskC();
        fourthTask();
        fifthTask();
        seventhTask();
        eighthTask();
        ninthTask();
    }

    private static void secondTaskA(){

        System.out.println("2.a");
        System.out.println("x    x");
        System.out.println(" x  x ");
        System.out.println("  xx  ");
        System.out.println("  xx  ");
        System.out.println(" x  x ");
        System.out.println("x    x\n");
    }

    private static void secondTaskB(){

        System.out.println("2.b");
        System.out.println("x=====x");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("x=====x\n");
    }

    private static void secondTaskC(){

        System.out.println("2.c");
        System.out.println("*********");
        System.out.println("*Dainius*");
        System.out.println("*********\n");
    }

    private static void fourthTask(){

        System.out.println("x    x\n x  x \n  xx  \n  xx  \n x  x \nx    x\n" +
                "x=====x\n|     |\n|     |\n|     |\nx=====x\n" +
                "*********\n*Dainius*\n*********\n");
    }

    private static void fifthTask(){

        Scanner name = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = name.nextLine();

        Scanner weight = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Your weight");
        int userWeight = weight.nextInt();

        Scanner height = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Your height in meters like \"1.82\"");
        String userHeightTemp = height.nextLine();
        float userHeight =Float.parseFloat(userHeightTemp.replace(',','.'));

        System.out.println("User name is "+ userName+ "\nUser weight "
                + userWeight + "\nUser height " + userHeight);
        System.out.printf("User BMI = %.1f\n",bodyMassIndex(userWeight, userHeight));
    }

    public static double bodyMassIndex(int weight, float height){

        double bmi;
        bmi = weight/pow(height,2);
        return bmi;
    }

    private static void seventhTask(){

        String name = "Dainius";
        System.out.println("\n" + name.toUpperCase());
    }

    private static void eighthTask(){

        String pattern = "x    x\n x  x \n  xx  \n  xx  \n x  x \nx    x\n";

        System.out.println("Full pattern");
        System.out.println(pattern);
        System.out.println("Sliced to half");
        System.out.println(pattern.substring(0, 21));
    }

    private static void ninthTask(){

        String pattern = "x    x\n x  x \n  xx  \n  xx  \n x  x \nx    x\n";

        System.out.println("Full pattern");
        System.out.println(pattern);
        System.out.println("Sliced to half");
        System.out.println(pattern.substring(pattern.indexOf(pattern), pattern.length()/2));
    }

}
