package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q10ScholarshipCheck {
    /*Check scholarship status based on percentage and income:
    If percentage ≥ 90 and income < ₹2L → "Full Scholarship"
    Else if percentage ≥ 80 or income < ₹4L → "Partial Scholarship"
    Else → "No Scholarship"*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();
        System.out.print("Enter income (in ₹): ");
        int income = sc.nextInt();

        String result = (percentage >= 90 && income < 200000) ? "Full Scholarship"
                : (percentage >= 80 || income < 400000) ? "Partial Scholarship"
                : "No Scholarship";
        System.out.println(result);
    }
}
