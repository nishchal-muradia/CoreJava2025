package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q4LeapYearTernary {
    //Write a program to check if a year is a leap year using ternary.
    //Input: Year
    //Output: "Leap year" or "Not a leap year"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "Leap year" : "Not a leap year";
        System.out.println(result);
    }
}