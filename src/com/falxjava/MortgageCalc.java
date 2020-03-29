package com.falxjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void computePayment() {
        System.out.println("This calc helps you compute the interest payment on your mortgage");
        System.out.println("It takes in the amount (A), the annual interest (I), and the period (n) in years as inputs");

        System.out.print("\nEnter the loan amount (A): ");
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.next().trim());

        System.out.print("Enter the annual interest rate (I): ");
        double interest = (Double.parseDouble(scanner.next().trim()) / 12) / 100;

        System.out.print("Enter the loan period (n) in years: ");
        int period = Integer.parseInt(scanner.next().trim()) * 12;

        double payment = amount*(interest/(1-(Math.pow(1+interest,-period))));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // System.out.println("\nAmount: " + amount + ", Interest: " + interest + ", Period: " + period);
        System.out.println("\nYour monthly payment is: " + currency.format(payment));
    }
}
