package PracticeSheets.Module4LoopsInJava.doWhileLoop;

import java.util.Scanner;

public class Q2PrintEvenToN {
    //Question: Use a do-while loop to print all even numbers from 2 up to N.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = 2;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= n);

        sc.close();
    }
}
