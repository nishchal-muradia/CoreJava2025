package LiveClass.Loops.WhileLoop;

import java.util.Scanner;

public class Pallandrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Num");
        int number = sc.nextInt();

        int rev = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // get the digit value

            rev = rev * 10 + digit;

            temp = temp / 10; // remove last digit
        }

        if (number == rev) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("Not palindrome");
        }



    }


}
