package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q5SquaresOfNumbers {
    //Write a program to print the squares of numbers from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}
