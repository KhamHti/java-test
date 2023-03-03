package com.kkkh;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static double firstNumb ;
    private static double secNumb ;

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name.");
        if (scanner.hasNextDouble()) {
            System.exit(0);
        }else {
            System.out.println(" Hello " + scanner.next());
            System.out.println("____________________________");
            System.out.println("What do you want to do ?\n" +
                    "1. Add\n" +
                    "2. Subtract\n" +
                    "3. Multiply\n" +
                    "4. Division\n" +
                    "Others. Quit\n" +
                    "________________________________________");

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                if (input == 1) {
                    userInput();
                    System.out.println("The answer of " + firstNumb + " + " + secNumb + " is " + (firstNumb + secNumb));
                } else if (input == 2) {
                    userInput();
                    System.out.println("The answer of " + firstNumb + " - " + secNumb + " is " + (firstNumb - secNumb));

                } else if (input == 3) {
                    userInput();
                    System.out.println("The answer of " + firstNumb + " * " + secNumb + " is " + (firstNumb * secNumb));

                } else if (input == 4) {
                    userInput();
                    System.out.println("The answer of " + firstNumb + " / " + secNumb + " is " + (firstNumb / secNumb));

                } else {
                    System.out.println("Finish");
                }

            } else {
                System.out.println("Finish");
                System.exit(0);
            }
        }
        }

    public  static void userInput() {
        System.out.println("Enter first number");
        if (scanner.hasNextDouble()) {
            firstNumb = scanner.nextDouble();
        } else {
            System.out.println("Finish");
            System.exit(0);
        }
        System.out.println("Enter second number");
        if (scanner.hasNextDouble()) {
            secNumb = scanner.nextDouble();
        } else {
            System.out.println("Finish");
            System.exit(0);
        }
    }
}
