package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q10OddPowerSeries {
    /*Compute Series: s = x + x³/3 + x⁵/5 + x⁷/7 + ... + xⁿ/n
    Write a program to evaluate the series s = x + x³/3 + x⁵/5 + x⁷/7 + ... + xⁿ/n.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter value of n (must be odd or highest odd <= n will be used): ");
        int n = scanner.nextInt();

        int power = 1;
        double sum = 0;

        while (power <= n) {
            sum += Math.pow(x, power) / power;
            power += 2;
        }

        System.out.println("Sum of series s = x + x^3/3 + x^5/5 + ... + x^n/n is: " + sum);
        scanner.close();
    }
}
