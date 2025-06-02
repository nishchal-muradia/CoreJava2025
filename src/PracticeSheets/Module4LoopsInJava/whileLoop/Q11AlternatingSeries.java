package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q11AlternatingSeries {
   /* Compute Alternating Series: s = 1 + x - x²/2 + x³/3 - x⁴/4 + ... + xⁿ/n
    Write a program to find the value of the alternating series:
    s = 1 + x - x²/2 + x³/3 - x⁴/4 + ... + xⁿ/n.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        int i = 1;
        double sum = 1 + x;
        boolean subtract = true;

        while (i <= n) {
            double term = Math.pow(x, i) / i;
            if (i == 1) {
                i++;
                continue;
            }
            if (subtract) {
                sum -= term;
            } else {
                sum += term;
            }
            subtract = !subtract;
            i++;
        }

        System.out.println("Sum of the alternating series is: " + sum);
        scanner.close();
    }
}
