package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q2MultiplicationTable {
    //Write a program to print the multiplication table of a given number up to 10.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
