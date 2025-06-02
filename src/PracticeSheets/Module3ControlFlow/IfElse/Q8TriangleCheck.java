package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q8TriangleCheck {
    /*Write a program to check whether three given sides can form a valid triangle.
    Condition: The sum of any two sides must be greater than the third.
    Input: Three integers representing sides
    Output: "Valid triangle" or "Invalid triangle*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
