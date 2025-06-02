package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q7DaysInMonth {
    /*Write a program to print number of days in a month (use switch for 1–12):
    Input: Month number
    Output: "31 Days", "30 Days", or "28/29 Days" for February
    Optional: Ask user for year too, and check for leap year.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1–12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 Days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 Days");
                break;
            case 2:
                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                System.out.println(isLeap ? "29 Days (Leap Year)" : "28 Days");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
