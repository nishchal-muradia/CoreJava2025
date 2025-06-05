package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

import java.util.Scanner;

public class Q5IncreasingTriangle {

    /*Print an Increasing Triangle of Stars
     *
     **
     ***
     ****
     ******/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {         // rows
            for (int j = 1; j <= i; j++) {     // stars in each row
                System.out.print("*");
            }
            System.out.println();              // move to next line
        }
    }
}

