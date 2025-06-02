package PracticeSheets.Module4LoopsInJava.doWhileLoop;

import java.util.Scanner;

public class Q3LargestDigit {
    //Question: Use a do-while loop to find the largest digit present in a given integer.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int max = 0;
        int digit;
        do {
            digit = num % 10;
            if (digit > max) max = digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Largest digit: " + max);
        sc.close();
    }
}
