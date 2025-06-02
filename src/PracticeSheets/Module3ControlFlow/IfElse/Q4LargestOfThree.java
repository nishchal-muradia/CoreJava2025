package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q4LargestOfThree {
    /*Write a program to find the largest among three given numbers using if-else.
    Input: Three integers
    Output: "First is largest", "Second is largest", or "Third is largest".*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("First is largest");
        } else if (b >= a && b >= c) {
            System.out.println("Second is largest");
        } else {
            System.out.println("Third is largest");
        }
    }
}
