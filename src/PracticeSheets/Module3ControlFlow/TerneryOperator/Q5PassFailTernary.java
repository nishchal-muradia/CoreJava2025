package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q5PassFailTernary {
    //Write a program to check if a student passed (marks ≥ 40) using ternary.
    //Input: Marks
    //Output: "Pass" or "Fail"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}

