package com.java;

import java.util.Scanner;

public class ControlFlow {
    public boolean checkLoanEligibility() {
        boolean hasHighIncome = false;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = true;
        final long MINIMUM_INCOME = 300_000L;

        System.out.println("\nLoan Eligibility Criteria");
        System.out.println("**************************");
        System.out.print("\nEnter your level of income: ");
        Scanner scanner = new Scanner(System.in);
        long salary = scanner.nextLong();
        if (salary>=MINIMUM_INCOME) {
            hasHighIncome = true;
        }

        System.out.println("\nHave you ever defaulted on your loan?");
        System.out.println("a. Yes");
        System.out.println("b. No");
        System.out.print("Please select a or b: ");
        char defaultStatus = scanner.next().charAt(0);
        if(defaultStatus=='b') {    // use a single quote for the char 'b'
            hasGoodCredit = true;
        }

        System.out.println("\nHave you ever been imprisoned?");
        System.out.println("a. Yes");
        System.out.println("b. No");
        System.out.print("Please select a or b: ");
        char criminalRecord = scanner.next().charAt(0);
        if(criminalRecord=='b') {    // use a single quote for the char 'b'
            hasCriminalRecord = false;
        }

        return (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }

    public void controlFlowSummary() {
        // Comparison operators
        // equal to:                    ==
        // not equal to:                !=
        // less than:                   <
        // less than or equal to:       =<
        // greater than:                >
        // greater than or equal to:    >=

        int x = 50;
        int y = (int) (Math.random() * 100);

        // Comparison operators are used in Boolean expressions
        // Boolean expressions return a boolean value - either true of false
        System.out.println("If (int)x=" + x + " and (int)y=" + y + ", then x==y returns " + (x==y));
        System.out.println("If (int)x=" + x + " and (int)y=" + y + ", then x>=y returns " + (x>=y));

        // Logical operators
        // Can be used to combine multiple boolean expressions
        // logical AND:         &&              returns true if all expressions are true
        // logical OR:          ||              returns true if at least one expression is true
        // NOT operator:        !               reverses the value of a boolean expression

        boolean isEligible = checkLoanEligibility();

        if (isEligible) {
            System.out.println("\n1. Am I eligible: Yes");
        }
        else {
            System.out.println("\n1. Am I eligible: No");
        }

        // The ternary operator
        // Used to simplify the if statement
        // Same as JS ternary operator
        String doesQualify = (isEligible)? "Yes": "No";
        System.out.println("2. Am I eligible: " + doesQualify);

        // Switch statement
        System.out.print("\nPlease enter your role: ");
        Scanner scanner = new Scanner(System.in);
        String role = scanner.next().trim().toLowerCase();

        switch (role) {
            case "admin":
                System.out.println("\nProceed to http://admin.com");
                break;
            case "moderator":
                System.out.println("Proceed to http://moderator.com");
                break;
            default:
                System.out.println("Proceed and browser as a guest at http://home.com");
        }
    }

}
