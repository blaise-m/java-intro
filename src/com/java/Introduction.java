package com.java;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Introduction {
    public static void introductionSummary() {
        System.out.println("Hello World");

        // Primitive types
        // byte     1byte       [-128, 127]
        // short    2bytes      [-32k, 32k]
        // int      4bytes      [-2B, 2B]
        // long     8bytes
        // float    4bytes
        // double   8bytes
        // char     2bytes      A,B,C,...
        // boolean  1byte       true/false

        byte age = 30;
        int viewsCount = 243_236_384;    // underscore used as a thousand separator
        long myBalance = 23_348_384_000L;   // Numbers are by default taken to be integers. Add L for long
        double price = 10.99;
        float costPrice = 12.12F;    // By default floating point numbers are taken to be doubles. Add F for float
        char initial = 'B';     // Use single quotes for a single letter and double quotes for multiple characters
        boolean isActive = true;

        // Intro to Reference types
        Date now = new Date();
        System.out.println(now);

        // Reference types are instantiated using the new keyword
        // They point to the address of the object in memory and not its value
        // Consider the example below

        int x = 25;
        int y = x;
        // System.out.println(y);  // returns 25

        x = 30;
        // System.out.println(y);  // returns 25

        Point point1 = new Point(15,20);
        Point point2 = point1.getLocation();
        // System.out.println(point2);     // returns x:15, y:20

        point1.x = 20;
        System.out.println("\n" + point2);      // returns x:20, y:20

        point2.y = 30;
        // System.out.println(point1);     // returns x:20, y:30

        // Strings in Java
        // Though strings are reference type variables, we don't use the new keyword to instantiate them
        // We simply use the String type, and assign the string literal to the variable as a shortcut

        String myName = "Blaise Mubangizi";
        System.out.println("\nMy name is: " + myName);

        // In java, strings are immutable
        // Any string method will return a new instance of the string object
        // String methods e.g.

        System.out.println("Lower Case Name is: " + myName.toLowerCase());

        // Arrays in java
        // In java, an array has a fixed length
        // Items cannot be added or removed from an array
        // But that does not mean that arrays are immutable
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        // Initialising an array if the elements are known in advance
        int[] ages = { 20, 22, 29, 30, 27 };
        // System.out.println(ages.length);
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // Multi-dimensional Arrays
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[1][1] = 1;
        matrix[2][2] = 1;
        System.out.println(Arrays.deepToString(matrix));

        // Initializing a multi-dimension array with elements
        int[][] coordinates = { {1,2}, {3,4} };
        System.out.println(Arrays.deepToString(coordinates));

        // Constants in java
        // Constants are created using the final keyword
        // By convention constant names are usually all caps
        final float PI = 3.14F;

        // Calculate the area of a circle with a radius of 15cm
        float area = PI * 15 * 15;
        System.out.println("\nThe area of the circle is: " + area);

        // Arithmetic operators in Java
        int result = 4 + 5;
        System.out.println("4 + 5 = " + result);
        int div = 9 / 2;
        System.out.println("Integer division: 9 / 2 = " + div);

        // Integer division truncates the value of the quotient
        // To return a double or float with integer division, use type casting
        double quotient = (double)9 / (double)2;
        System.out.println("Type casting division: 9 / 2 = " + quotient);

        double sum = 0.1 + 0.1 + 0.1;
        System.out.println("Testing floating point addition in java: 0.1 + 0.1 + 0.1 = " + sum);

        // Increment operators
        int a = 1;
        a++;
        System.out.println("If a=1, a++ returns " + a);

        int b = 1;
        ++b;
        System.out.println("If b=1, ++b returns " + b);

        int c = 1;
        int d = ++c;
        System.out.println("If c=1 and d=++C, d=" + d + " and c=" + c);

        int e = 1;
        int f = e++;
        System.out.println("But if e=1 and f=e++, then f=" + f + " and e=" + e);

        // Augmented or compound assignment operators
        x = x + 1;
        x += 1;

        // Casting and type conversion
        // Implicit casting (from a small variable type to a bigger variable type
        // E.g. byte -> short -> int -> double
        // Or from a less precise variable type to a more precise variable type
        // E.g int -> double
        short l = 20;
        int m = l + 15;
        System.out.println("\nGiven two variables l (a short) and m (an int);");
        System.out.println("If l=20 and m=l+15, then m=" + m);

        // Explicit casting
        // Works when the variable type are compatible e.g float to int
        double j = 1.1;
        int k = (int)j + 1;
        System.out.println("If j=1.1 and k=j+1, then k=" + k);

        // Casting using wrapper classes
        // Variable types have wrapper classes that have helper methods
        // E.g Integer for int, Float for float, ...
        // To convert a string to an int, use the parseInt helper method of the Integer wrapper class
        String h = "1";
        int i = Integer.parseInt(h) + 1;
        System.out.println("If h='1' and i=h+1, then i=" + i);
        float n = Float.parseFloat(h) + 2.2F;
        System.out.println("If n=h+2.2, then n=" + n);

        // The Math class
        int roundResult = Math.round(2.6F);
        System.out.println("Round(2.6) returns " + roundResult);
        int floorResult = (int)Math.floor(2.6);
        System.out.println("Floor(2.6 returns " + floorResult);

        // Number Formatting
        // To format numbers, we use the NumberFormat class
        // This class is an abstract class and cannot be instantiated using the new keyword
        // We use factory methods to create instances of this class
        // See e.g below:
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(0.1);
        System.out.println("\n0.1 as a percent is " + percentResult);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(200000.256);
        System.out.println("200000.256 as a currency is " + currencyResult);

        // Reading user input
        // To read user input, we use the scanner class
        // It is instantiated with one variable, the way we will retrieve the input
        // To get input from the console, use System.in
        // just as we have System.out for printing to the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your first name: ");
        String firstName = scanner.next().trim();
        // Next method captures one token/value
        // It ignores everything after a space or tab
        System.out.print("Enter your last name: ");
        String lastName = scanner.next().trim();
        System.out.println("Scanner 1: Your name is " + firstName + " " + lastName);

        // To capture the entire string even with spaces
        // Use the nextLine() method
        // Using nextLine after using next() fails
        // nextLine() needs to be the first method called
        // or instantiate a new scanner to use with nextLine()
        System.out.print("\nEnter your full name: ");
        Scanner nextLineScanner = new Scanner(System.in);
        String fullName = nextLineScanner.nextLine().trim();
        System.out.println("Scanner 2: Your name is " + fullName);
    }
}
