package LiveClass.Module5.Functions;

import java.util.Scanner;

public class Multiplication {

    public void printTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + num * i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Multiplication mul = new Multiplication();
        mul.printTable(num);

    }
}
