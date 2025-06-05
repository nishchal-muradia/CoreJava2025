package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q4EvenNumbers {
    //Write a program to print all even numbers between 1 and a given number n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
