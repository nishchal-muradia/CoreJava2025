package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q15PalindromeNumber {
    //Write a program to check whether a number is a palindrome.
    //(A number is a palindrome if it reads the same backward as forward, e.g., 121)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome: ");
        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (reversed == original) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }

        scanner.close();
    }
}
