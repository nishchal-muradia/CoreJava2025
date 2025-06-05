package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

import java.util.Scanner;

public class Q3NStarsSameLine {
    //Print n Stars on Same Line
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars (n): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
