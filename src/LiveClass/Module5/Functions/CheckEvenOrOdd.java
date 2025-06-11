package LiveClass.Module5.Functions;

import java.util.Scanner;

public class CheckEvenOrOdd {

    public boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        CheckEvenOrOdd obj = new CheckEvenOrOdd(); // object creation of class
        boolean result = obj.checkEven(num);

        if (result) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is ODD");
        }


    }
}
