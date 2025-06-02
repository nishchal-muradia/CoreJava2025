package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q1DayOfWeek {
    /*Write a program that takes a number (1–7) and prints the corresponding day of the week.
    Input: Integer from 1 to 7
    Output: "Monday", "Tuesday", ..., "Sunday"*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1–7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number");
        }
    }
}

