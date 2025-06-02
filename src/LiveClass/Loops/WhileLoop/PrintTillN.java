package LiveClass.Loops.WhileLoop;

import java.util.Scanner;

public class PrintTillN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");

        int n = sc.nextInt();  // taking input from user

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i <= n);

    }
}
