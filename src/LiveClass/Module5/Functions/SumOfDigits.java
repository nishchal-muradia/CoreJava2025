package LiveClass.Module5.Functions;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigit(int num) {
        int sum = 0;

        while (num != 0) {
            int r = num % 10; // get the reminder
            sum += r; // add the sum
            num /= 10; // num= num/10
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number");
        int num2 = sc.nextInt();

        if (sumOfDigit(num1) != sumOfDigit(num2)) {
            System.out.println("UNIQUE SUM");
        } else {
            System.out.println("Not interested");
        }

    }
}
