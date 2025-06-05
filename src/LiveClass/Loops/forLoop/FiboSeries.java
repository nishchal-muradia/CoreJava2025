package LiveClass.Loops.forLoop;

import java.util.Scanner;

public class FiboSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the input");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}
