package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q15PalindromeCheck {
    //Write a program to check whether a number is a palindrome using a for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
