package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q16PrimeNumber {
    //Write a program to check whether a number is prime or not.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for prime: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            int i = 2;
            boolean isPrime = true;

            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is not a Prime number.");
            }
        }

        scanner.close();
    }
}
