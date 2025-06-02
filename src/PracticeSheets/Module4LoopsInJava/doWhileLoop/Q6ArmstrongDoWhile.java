package PracticeSheets.Module4LoopsInJava.doWhileLoop;

import java.util.Scanner;

public class Q6ArmstrongDoWhile {
    //Write a program to check whether a number is an Armstrong number.
    //(Example: 153 = 1³ + 5³ + 3³ = 153)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int digits = 0, temp = num;
        do {
            digits++;
            temp /= 10;
        } while (temp != 0);

        int sum = 0;
        temp = num;
        do {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        } while (temp != 0);

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
