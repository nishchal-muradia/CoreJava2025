package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q7ProductOfFiveNumbers {
    //Write a program to take 5 numbers as input and print their product.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        long product = 1;

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = scanner.nextInt();
            product *= num;
            count++;
        }

        System.out.println("Product of 5 numbers is: " + product);
        scanner.close();
    }
}

