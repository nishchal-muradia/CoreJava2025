package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q11ReverseNumber {
    //Write a program to reverse a given number using a for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number = " + reverse);
    }
}
