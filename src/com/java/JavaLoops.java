package com.java;

import java.util.Scanner;

public class JavaLoops {
    public static void loopsSummary() {
        // The for loop
        // Used when you know in advance how many times the loop will run
        for(int i=1; i<2; i++) {
            System.out.println(i + ". Hello World");
        }

        // The while loop
        // Used when you don't know in advance how many times the loop will run
        System.out.println("\nThe Fine Method");
        System.out.println("*****************");
        System.out.println("\nBelieve me, you will be fine!");

        Scanner scanner = new Scanner(System.in);

        String fineStatus = "no";
        while(!fineStatus.equals("yes")) {
            System.out.print("Are you fine? ");
            fineStatus = scanner.next().toLowerCase();
        }

        // break and continue statements
        // break statement terminates a loop
        // continue statement moves control to the beginning of the loop
        // in other words, continue skips one iteration
        // while break skips all the remaining iterations
        // break statement especially useful in terminating infinite loops

        // Print numbers from 1 to 10 except 5
        System.out.println("\nNumbers from 1 to 10:");
        System.out.println("    (And 5?)");
        System.out.println("***********************");
        for(int i=1; i<=10; i++) {
            if (i==5) {
                continue;
            }
            System.out.println(i);
        }

        // The forEach loop
        // Uses colon ( : ) as opposed to the 'in' or 'of' keywords
        System.out.println("\nFruits on today's menu");
        System.out.println("*************************");
        String[] fruits = { "Apples", "Mangoes", "Peers", "Passion", "Oranges" };

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
