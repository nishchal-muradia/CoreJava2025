package LiveClass.Module5.ClassAndObjects;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Operations op = new Operations();// this is how we create object.
        int a = 5;
        int b = 10;

        int result = op.add(a, b);
        System.out.println(result);


    }

}

class Operations {

    public int add(int a, int b) {
        int c = a + b;

        return c;
    }

}
