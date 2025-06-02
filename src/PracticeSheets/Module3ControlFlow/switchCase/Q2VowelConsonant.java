package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q2VowelConsonant {
    //Write a program that takes a character and checks if it’s a vowel or consonant using switch-case.
    //Input: A single alphabet character
    //Output: "Vowel" or "Consonant"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch(ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            default:
                if (Character.isLetter(ch)) System.out.println("Consonant");
                else System.out.println("Not a valid alphabet");
        }
    }
}
