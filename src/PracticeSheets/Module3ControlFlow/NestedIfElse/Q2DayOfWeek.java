package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q2DayOfWeek {
    /*Write a program that takes a number from 1 to 7 and prints the corresponding day of the week.
    Example: 1 → "Monday", 7 → "Sunday"
    Input: Integer (1–7)                Output: Name of the day*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (1–7): ");
        int day = scanner.nextInt();

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Invalid input");
    }
}
