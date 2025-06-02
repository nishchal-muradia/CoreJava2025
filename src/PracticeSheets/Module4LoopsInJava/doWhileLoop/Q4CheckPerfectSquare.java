package PracticeSheets.Module4LoopsInJava.doWhileLoop;

import java.util.Scanner;

public class Q4CheckPerfectSquare {
    //Using a do-while loop, check whether a given number is a perfect square (without
    //using built-in sqrt functions).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        boolean isPerfectSquare = false;

        do {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
            i++;
        } while (i * i <= num);

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

        sc.close();
    }
}
