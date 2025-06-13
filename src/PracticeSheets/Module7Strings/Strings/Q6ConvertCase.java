package PracticeSheets.Module7Strings.Strings;

public class Q6ConvertCase {
    // Write a program that takes the input "HeLLo" and converts
    // all characters to lowercase, then to uppercase.
    public static void main(String[] args) {
        String input = "HeLLo";

        String lower = input.toLowerCase();
        String upper = input.toUpperCase();

        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
    }
}

