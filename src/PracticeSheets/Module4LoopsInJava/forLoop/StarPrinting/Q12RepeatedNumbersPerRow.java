package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

import java.util.Scanner;

public class Q12RepeatedNumbersPerRow {
    //Print Repeated Numbers per Row
    //1
    //22
    //333
    //4444
    //55555
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
