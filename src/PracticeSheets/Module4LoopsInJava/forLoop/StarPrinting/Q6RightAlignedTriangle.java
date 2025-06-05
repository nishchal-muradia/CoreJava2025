package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

import java.util.Scanner;

public class Q6RightAlignedTriangle {
    // Print a Right-Aligned Triangle of Stars
     //               *
     //              **
     //             ***
     //            ****
     //           *****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
