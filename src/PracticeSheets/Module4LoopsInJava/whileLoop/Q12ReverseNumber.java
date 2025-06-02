package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q12ReverseNumber {
    //Write a program to reverse the digits of an entered number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number is: " + reversed);
        scanner.close();
    }
}

