package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q1PrintNumbers {
    // Write a program to print all numbers from 1 to a given number n using a for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
