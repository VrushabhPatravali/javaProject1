package com.pragra.exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

    monthDays();
    }

    public static void monthDays() {

        System.out.print("Enter month number: ");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        System.out.println(monthNumber);

        switch(monthNumber) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 2:
                System.out.println("28 days");
                break;

            default:
                System.out.println("invalid input");
                break;
        }
    }
}
