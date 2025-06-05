package LiveClass.Module5.Functions;

import LiveClass.Module5.ClassAndObjects.Calculator;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        // creating a object
        CalculatorApp ca = new CalculatorApp();

        // add
        int add = ca.add(num1, num2);
        System.out.println("sum is " + add);

        //sub
        int sub = ca.sub(num1, num2);
        System.out.println("Sub is " + sub);

        //mul
        int mul = ca.mul(num1, num2);
        System.out.println("Multiply is " + mul);

        // div
        int div = ca.div(num1, num2);
        System.out.println("Division is " + div);







    }
}
