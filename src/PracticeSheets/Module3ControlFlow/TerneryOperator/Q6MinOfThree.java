package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q6MinOfThree {
    //Write a program to find the minimum of three numbers using nested ternary.
    //Input: Three integers
    //Output: Minimum value
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Minimum: " + min);
    }
}
