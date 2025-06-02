package PracticeSheets.Module4LoopsInJava.doWhileLoop;

import java.util.Scanner;

public class Q1Print1ToN {
    //Question: Write a program to print numbers from 1 to N using a do-while loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= n);

        sc.close();
    }
}
