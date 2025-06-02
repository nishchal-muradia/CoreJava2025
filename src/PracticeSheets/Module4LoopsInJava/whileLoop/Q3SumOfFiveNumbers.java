package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q3SumOfFiveNumbers {
    //Write a program to take 5 numbers from the user and print their sum.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
            count++;
        }

        System.out.println("Sum of 5 numbers is: " + sum);
        scanner.close();
    }
}
