package LiveClass.Loops.WhileLoop;

import java.util.Scanner;

public class Sum5NumbersUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int result = 0;
        while (i <= 5) {
            int num = sc.nextInt();
            result = result + num;
            i++; // inc
        }
        System.out.println("The result = " +result);
    }
}
