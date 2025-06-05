package LiveClass.Loops.BreakStatement;

import java.util.Scanner;

public class BreakExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even found. Stop");
                break;
            }

        }

    }
}
