package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year to determine if it's a leap year or not.");
        int userYear = scanner.nextInt();
        scanner.close();
        isLeapYear(userYear);

    }

    public static void isLeapYear(int year) {
        boolean isLeap = false;
        if(year < 1 || year > 9999) {
            isLeap = false;
            System.out.println(year + " is not a leap year.");
            return;
        }

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if(isLeap = true) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " isn't a leap year.");
        }
    }

}
