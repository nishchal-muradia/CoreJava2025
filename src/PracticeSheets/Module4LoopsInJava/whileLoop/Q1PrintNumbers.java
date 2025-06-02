package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q1PrintNumbers {
    //Write a program to print numbers from 1 to N using a while loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to print numbers from 1 to N: ");
        int N = scanner.nextInt();

        int i = 1;
        while (i <= N) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        scanner.close();
    }
}
