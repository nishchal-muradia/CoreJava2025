package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

import java.util.Scanner;

public class Q9CenteredPyramid {
    //Print a Centered Pyramid of Stars
    //    *
    //   ***
    //  *****
    // *******
    //*********
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars: (2*i - 1) stars in each row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
