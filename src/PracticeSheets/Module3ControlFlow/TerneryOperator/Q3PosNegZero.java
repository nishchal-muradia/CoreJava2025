package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q3PosNegZero {
    //Write a program to check whether a number is positive or negative (or zero).
    //Input: Integer
    //Output: "Positive", "Negative", or "Zero"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}
