package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q9SumOfDigits {
    //Write a program to calculate the sum of digits of a number entered by the user.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int num = scanner.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits is: " + sum);
        scanner.close();
    }
}
