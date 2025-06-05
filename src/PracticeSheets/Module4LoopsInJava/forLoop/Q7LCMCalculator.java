package PracticeSheets.Module4LoopsInJava.forLoop;

import java.util.Scanner;

public class Q7LCMCalculator {
    //Write a program to find the Least Common Multiple (LCM)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM = " + lcm);
                break;
            }
            lcm++;
        }
    }
}

