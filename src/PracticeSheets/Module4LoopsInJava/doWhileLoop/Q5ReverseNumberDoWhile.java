package PracticeSheets.Module4LoopsInJava.doWhileLoop;

import java.util.Scanner;

public class Q5ReverseNumberDoWhile {
    //Write a program to reverse the digits of an entered number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        do {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
