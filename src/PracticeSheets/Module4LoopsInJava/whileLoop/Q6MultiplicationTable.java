package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q6MultiplicationTable {
    //Write a program to print the multiplication table of a given number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        scanner.close();
    }
}
