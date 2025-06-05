package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

import java.util.Scanner;

public class Q4SquareOfStars {
    //Print Square of Stars (n x n Stars
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square (n): ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
