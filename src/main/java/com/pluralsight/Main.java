package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring the variables
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter you first number: ");
        int firstNum = myScanner.nextInt();
        System.out.print("Enter your second number: ");
        int secondNum = myScanner.nextInt();

        System.out.print("Possible Calculations ");
        String character2 = myScanner.next();


        System.out.println("Here is the result");
        //Adding the conditions
        if (character2.equals("A")) {
            int finalNum = firstNum + secondNum;
            System.out.println("Your new number is: " +finalNum);
        } else if (character2.equals("S")) {
            int subtractNum = firstNum - secondNum;
            System.out.println("Subtracting it results in:" + subtractNum);
        } else if (character2.equals("M")) {
            int multiplyNum = firstNum * secondNum;
            System.out.println("Multiplying the number is:" + multiplyNum);
        } else if (character2.equals("D")) {
            int dividNum = firstNum/secondNum;
            System.out.println("Dividing the number is: " + dividNum);
        } else {
            System.out.println("You need to enter a Character above!!");
        }
    }
}
