package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q13ArmstrongNumber {
    //Write a program to check whether a number is an Armstrong number.
    //(Example: 153 = 1³ + 5³ + 3³ = 153)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for Armstrong: ");
        int num = scanner.nextInt();
        int original = num;
        int sum = 0;
        int digits = 0, temp = num;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
