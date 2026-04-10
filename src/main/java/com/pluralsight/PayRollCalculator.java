package com.pluralsight;

import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = myScanner.nextLine();
        System.out.print("Enter how many hours you worked: ");
        float workedHours = myScanner.nextFloat();
        System.out.print("What is your pay rate: ");
        float payRate = myScanner.nextFloat();
        if( workedHours > 40) {
            double extraHours = workedHours - 40;
            double overTime = extraHours * payRate * 1.5;
            double regularPay = 40 * payRate;
            double OverallPaid = overTime + regularPay;
            System.out.println("Your over time pay is: " + OverallPaid);
        } else {

           double paytime = workedHours * payRate;
            System.out.println("Here is ther regular pay: " + paytime);
        }
    }
}
