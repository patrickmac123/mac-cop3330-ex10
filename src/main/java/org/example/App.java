package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 10 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    private static final double taxrate = 0.055;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter the price of item 1: " );
        String stringItemone = scan.nextLine();
        System.out.print( "Enter the quantity of item 1: " );
        String stringQuantityone = scan.nextLine();
        System.out.print( "Enter the price of item 2: " );
        String stringItemtwo = scan.nextLine();
        System.out.print( "Enter the quantity of item 2: " );
        String stringQuantitytwo = scan.nextLine();
        System.out.print( "Enter the price of item 3: " );
        String stringItemthree = scan.nextLine();
        System.out.print( "Enter the quantity of item 3: " );
        String stringQuantitythree = scan.nextLine();

        double itemOne = Double.parseDouble(stringItemone);
        double QuantityOne = Double.parseDouble(stringQuantityone);
        double itemTwo = Double.parseDouble(stringItemtwo);
        double QuantityTwo = Double.parseDouble(stringQuantitytwo);
        double itemThree = Double.parseDouble(stringItemthree);
        double QuantityThree = Double.parseDouble(stringQuantitythree);

        double totalOne = itemOne * QuantityOne;
        double totalTwo = itemTwo * QuantityTwo;
        double totalThree = itemThree * QuantityThree;

        double subtotal = totalOne + totalTwo + totalThree;
        double tax = subtotal * taxrate;
        double finalTotal = subtotal + tax;

        System.out.println("Subtotal: $"+String.format("%.2f",subtotal));
        System.out.println("Tax: $"+String.format("%.2f",tax));
        System.out.println("Total: $"+String.format("%.2f",finalTotal));

    }
}