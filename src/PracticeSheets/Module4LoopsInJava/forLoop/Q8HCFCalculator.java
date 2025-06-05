package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q8HCFCalculator {
    //Write a program to calculate the Highest Common Factor (HCF)
    // or Greatest Common Divisor (GCD) of two given numbers using a for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF (GCD) = " + hcf);
    }
}
