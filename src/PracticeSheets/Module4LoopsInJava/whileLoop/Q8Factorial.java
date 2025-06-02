package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q8Factorial {
    //Write a program to calculate the factorial of a number entered by the user.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        scanner.close();
    }
}
