package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q2SumOfNaturalNumbers {
    //Write a program to calculate the sum of natural numbers from 1 to N.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to calculate sum from 1 to N: ");
        int N = scanner.nextInt();

        int sum = 0, i = 1;
        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println("Sum from 1 to " + N + " is: " + sum);
        scanner.close();
    }
}
