package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q6FibonacciSeries {
    //Write a program to print the first n terms of the Fibonacci series using a for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
