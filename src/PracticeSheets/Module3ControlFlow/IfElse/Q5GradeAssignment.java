package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q5GradeAssignment {
    /*Write a program to assign grades based on marks using the following rules:
            90–100 → "Grade A"
            80–89 → "Grade B"
            70–79 → "Grade C"
            60–69 → "Grade D"
            Below 60 → "Grade F"
            Input: Marks as an integer
            Output: Grade as per the range*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade D");
        } else if (marks < 60 && marks >= 0) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
}
