package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q8StudentResult {
   /* Write a program to check if a student passed based on marks in three subjects.
    Rules:
    If all subjects ≥ 40 and average ≥ 50 → "Pass"
    Else if any one subject < 40 → "Fail in that subject"
    Else → "Fail due to low average"
    Input: Marks of 3 subjects
    Output: Result*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = scanner.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;

        if (m1 >= 40 && m2 >= 40 && m3 >= 40 && avg >= 50) {
            System.out.println("Pass");
        } else if (m1 < 40 || m2 < 40 || m3 < 40) {
            System.out.println("Fail in subject(s)");
        } else {
            System.out.println("Fail due to low average");
        }
    }
}
