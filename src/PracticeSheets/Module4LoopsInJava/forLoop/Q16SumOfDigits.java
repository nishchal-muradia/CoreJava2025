package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q16SumOfDigits {
    //Write a program to calculate the sum of all digits in a given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (; num != 0; num /= 10) {
            sum += num % 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
