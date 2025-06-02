package LiveClass.Loops.WhileLoop;

import java.util.Scanner;

public class FirstNNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");

        int n = sc.nextInt();  // taking input from user

        int i = 1;
        int result =0;
        while (i <= n) {
            result = result+i; //result+=i;
            i++;
        }

        System.out.println("The sum is" + result);

    }
}
