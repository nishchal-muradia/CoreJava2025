package PracticeSheets.Module4LoopsInJava.whileLoop;

import java.util.Scanner;

public class Q14StrongNumber {
    //Write a program to check whether a number is a Strong number.
    //(A Strong number is a number for which the sum of the factorial of its digits equals
    //the number itself. Example: 145 = 1! + 4! + 5! = 145)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for Strong Number: ");
        int num = scanner.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1, i = 1;
            while (i <= digit) {
                fact *= i;
                i++;
            }
            sum += fact;
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is not a Strong number.");
        }

        scanner.close();
    }
}

