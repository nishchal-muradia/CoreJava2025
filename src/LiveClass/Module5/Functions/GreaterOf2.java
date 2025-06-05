package LiveClass.Module5.Functions;

import java.util.Scanner;

public class GreaterOf2 {

    public int findGreater(int a, int b) {
        return a > b ? a : b;
    }


    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        GreaterOf2 great = new GreaterOf2();
        int result = great.findGreater(num1, num2);

        System.out.println(result);


    }
}
