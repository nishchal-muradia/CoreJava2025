package LiveClass.Loops.forLoop;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the input");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }

    }

}
