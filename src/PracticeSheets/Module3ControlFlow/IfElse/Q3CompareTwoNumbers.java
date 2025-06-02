package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q3CompareTwoNumbers {
    /*Write a program to compare two numbers and print which one is greater, or if they are equal.
    Input: Two integers
    Output: "First is greater", "Second is greater", or "Both are equal"*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("First is greater");
        } else if (b > a) {
            System.out.println("Second is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}
