package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q17PerfectNumber {
    /*Write a program to check whether a number is a Perfect number.
    (A Perfect number is equal to the sum of its proper divisors, e.g., 28 = 1 + 2 + 4 + 7 + 14)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for perfect number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }

        scanner.close();
    }
}
