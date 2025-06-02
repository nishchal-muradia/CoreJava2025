package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q2MaxOfTwo {
    //Write a program to find the maximum of two numbers using a ternary operator.
    //Input: Two integers
    //Output: Larger number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);
    }
}
