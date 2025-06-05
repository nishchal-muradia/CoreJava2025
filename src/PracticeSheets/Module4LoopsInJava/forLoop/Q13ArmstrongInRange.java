package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q13ArmstrongInRange {
    //Write a program to print all Armstrong numbers between 1 and n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            int original = i;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }
    }
}
