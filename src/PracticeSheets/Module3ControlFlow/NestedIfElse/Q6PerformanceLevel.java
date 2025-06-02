package PracticeSheets.Module3ControlFlow.NestedIfElse;
import java.util.Scanner;

public class Q6PerformanceLevel {
    /*Write a program that takes a student's percentage and prints:
            ≥90 → "Excellent"
            80–89 → "Very Good"
            70–79 → "Good"
            60–69 → "Average"
            <60 → "Needs Improvement"
    Input: Percentage
    Output: Performance level*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percentage = scanner.nextInt();

        if (percentage >= 90) System.out.println("Excellent");
        else if (percentage >= 80) System.out.println("Very Good");
        else if (percentage >= 70) System.out.println("Good");
        else if (percentage >= 60) System.out.println("Average");
        else System.out.println("Needs Improvement");
    }
}
