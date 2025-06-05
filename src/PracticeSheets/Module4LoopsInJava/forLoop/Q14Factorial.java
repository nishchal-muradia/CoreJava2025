package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q14Factorial {
    //Write a program to calculate the factorial of a given number using a for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}
