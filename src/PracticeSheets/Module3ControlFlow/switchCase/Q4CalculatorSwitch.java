package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q4CalculatorSwitch {
    /*Write a basic calculator using switch-case that supports +, -, *, /.
    Input: Two numbers and an operator
    Output: Result of the operation*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch(op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/':
                if (b != 0) System.out.println("Result: " + (a / b));
                else System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid operator");
        }
    }
}
