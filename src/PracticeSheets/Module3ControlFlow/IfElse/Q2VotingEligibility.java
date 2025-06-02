package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q2VotingEligibility {
    /*Write a program to determine if a person is eligible to vote.
    Input: Age of the person
    Output: "Eligible to vote" if age is 18 or above, otherwise "Not eligible".*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }
    }
}
