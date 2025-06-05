package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q12PrimeInRange {
    //Write a program to print all prime numbers between
    // 1 and a given number n using nested for loops.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Prime numbers between 1 and " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

