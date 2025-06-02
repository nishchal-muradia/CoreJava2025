package PracticeSheets.Module3ControlFlow.switchCase;
import java.util.Scanner;

public class Q3GradeRemarks {
    /*Write a program to print remarks based on grade letter:
    A → Excellent
    B → Good
    C → Average
    D → Poor
    F → Fail
    Any other → Invalid Grade*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A–F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch(grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Poor"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid Grade");
        }
    }
}

