package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q8AreaCalculator {
    /*WAP to Create a menu: Use switch-case to perform the selected calculation
    Area of Circle
    Area of Rectangle
    Area of Triangle
    Exit
    Input: User's choice, and respective dimensions
    Output: Area*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of Circle\n2. Area of Rectangle\n3. Area of Triangle\n4. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + (Math.PI * r * r));
                break;
            case 2:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble(), b = sc.nextDouble();
                System.out.println("Area: " + (l * b));
                break;
            case 3:
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble(), height = sc.nextDouble();
                System.out.println("Area: " + (0.5 * base * height));
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
