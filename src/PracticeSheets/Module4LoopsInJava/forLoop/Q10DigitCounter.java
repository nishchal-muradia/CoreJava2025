package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q10DigitCounter {
    //Write a program to count how many digits a given integer contains.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
