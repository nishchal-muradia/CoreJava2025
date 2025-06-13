package PracticeSheets.Module7Strings.Strings;

public class Q9FindSubstring {
    //Write a program that takes the input "Java Programming" and checks
    // if the substring "Program" exists in it.

    public static void main(String[] args) {
        String input = "Java Programming";

        if (input.contains("Program")) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
    }
}

