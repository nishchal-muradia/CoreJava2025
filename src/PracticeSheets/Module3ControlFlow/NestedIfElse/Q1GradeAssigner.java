package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q1GradeAssigner {
    /*Write a program to assign a grade based on marks using the following conditions:
            90–100 → "A"
            80–89 → "B"
            70–79 → "C"
            60–69 → "D"
    Below 60 → "F"
    Input: Marks (0 to 100)
    Output: Grade*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (0–100): ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) System.out.println("Grade: A");
        else if (marks >= 80) System.out.println("Grade: B");
        else if (marks >= 70) System.out.println("Grade: C");
        else if (marks >= 60) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}

