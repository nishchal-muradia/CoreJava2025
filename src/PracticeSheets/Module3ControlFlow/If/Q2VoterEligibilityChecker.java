package PracticeSheets.Module3ControlFlow.If;

public class Q2VoterEligibilityChecker {
    /*Write a program to check if a person is eligible to vote.
     The person must be 18 or older and a citizen of the country.
     Use age and isCitizen boolean flag as input.
     Print "Eligible to vote" or "Not eligible to vote".*/

    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
