package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q4SeriesSum1 {
    /*Question: Write a program to find the value of s = x + x² + x³ + ... + xⁿ
    where x,  and n are entered by the user.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        int term = 1;
        double sum = 0;

        while (term <= n) {
            sum += Math.pow(x, term);
            term++;
        }

        System.out.println("Sum of series s = x + x² + ... + xⁿ is: " + sum);
        scanner.close();
    }
}
