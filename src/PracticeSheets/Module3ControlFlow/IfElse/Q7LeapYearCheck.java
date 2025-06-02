package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q7LeapYearCheck {
    /*Write a program to check if a given year is a leap year or not. Conditions:
    A year is a leap year if it is divisible by 4 and not divisible by 100, or divisible by 400.
    Input: Year as an integer
    Output: "Leap Year" or "Not a Leap Year"*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
