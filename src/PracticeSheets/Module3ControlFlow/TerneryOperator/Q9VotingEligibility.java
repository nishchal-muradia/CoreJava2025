package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q9VotingEligibility {
    //Write a program to check if a person can vote based on age and citizenship:
    //Age ≥ 18 and is a citizen → "Eligible"
    //Else → "Not Eligible"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Are you a citizen? (yes/no): ");
        String citizen = sc.nextLine();

        String result = (age >= 18 && citizen.equalsIgnoreCase("yes")) ? "Eligible" : "Not Eligible";
        System.out.println(result);
    }
}
