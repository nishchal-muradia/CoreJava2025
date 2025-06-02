package LiveClass.Loops.WhileLoop;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Num");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

         do{
            int digit = temp % 10; // get the digit value

            sum = sum + digit; // add the digit to the sum

            temp = temp / 10; // remove last digit
        }while (temp != 0);

        System.out.println(" The sum of " + number + " is " + sum);
    }
}
