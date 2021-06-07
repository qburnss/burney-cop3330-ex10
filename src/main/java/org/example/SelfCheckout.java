/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args){
        int ritem1, ritem1q, ritem2, ritem2q, ritem3, ritem3q;
        int item1total=0, item2total=0, item3total=0;
        double subtotal=0;
        double tax=0, total=0;



        System.out.println("Enter the price of item 1:");
        Scanner scanner = new Scanner(System.in);
        String item1 = scanner.next();
        System.out.println("Enter the quantity of item 1:");
        Scanner scanner3 = new Scanner(System.in);
        String item1q = scanner3.next();
        System.out.println("Enter the price of item 2:");
        Scanner scanner1 = new Scanner(System.in);
        String item2 = scanner1.next();
        System.out.println("Enter the quantity of item 2:");
        Scanner scanner4 = new Scanner(System.in);
        String item2q = scanner4.next();
        System.out.println("Enter the price of item 3:");
        Scanner scanner2 = new Scanner(System.in);
        String item3 = scanner2.next();
        System.out.println("Enter the quantity of item 3:");
        Scanner scanner5 = new Scanner(System.in);
        String item3q = scanner5.next();



        ritem1 = Integer.parseInt(item1);
        ritem1q = Integer.parseInt(item1q);
        ritem2 = Integer.parseInt(item2);
        ritem2q = Integer.parseInt(item2q);
        ritem3 = Integer.parseInt(item3);
        ritem3q = Integer.parseInt(item3q);

        item1total = ritem1q * ritem1;
        item2total = ritem2q * ritem2;
        item3total = ritem3q * ritem3;

        subtotal = item1total + item2total + item3total;
        tax = subtotal * 0.055;
        total = subtotal + tax;


        System.out.println("Subtotal: " + subtotal + "\n"
                + "Tax: " + tax + "\n"
                + "Total: " + total);

    }
}
