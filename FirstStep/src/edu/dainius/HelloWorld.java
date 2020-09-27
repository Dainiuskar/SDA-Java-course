package edu.dainius;

public class HelloWorld {

    public static void main(String[] args) {
        String name = "Dainius";
        int age = 43;

        System.out.println(name);
        System.out.println(age);

        // the same with function
        printNameAge();
    }

    private static void printNameAge() {
        String name = "Dainius ";
        int age = 43;

        System.out.println(name + age);
    }
}