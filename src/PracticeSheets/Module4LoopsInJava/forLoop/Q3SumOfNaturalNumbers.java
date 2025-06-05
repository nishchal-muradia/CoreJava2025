package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q3SumOfNaturalNumbers {
    //Write a program to calculate the sum of the first n natural numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
