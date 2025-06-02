package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q1EvenOddChecker {
    //Write a program to check if a number is even or odd. Use if-else to print "Even" or "Odd"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
