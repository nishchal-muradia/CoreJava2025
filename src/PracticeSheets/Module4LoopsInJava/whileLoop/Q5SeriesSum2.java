package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q5SeriesSum2 {
    //Question: Write a program to calculate the sum of the series: s = x + x²/2 + x³/3 + ... + xⁿ/n.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        int term = 1;
        double sum = 0;

        while (term <= n) {
            sum += Math.pow(x, term) / term;
            term++;
        }

        System.out.println("Sum of series s = x + x²/2 + ... + xⁿ/n is: " + sum);
        scanner.close();
    }
}
