package PracticeSheets.Module3ControlFlow.TerneryOperator;
import java.util.Scanner;

public class Q1EvenOddTernary {
    //Write a program to check if a number is even or odd using a ternary operator.
    //Input: An integer
    //Output: "Even" or "Odd"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
