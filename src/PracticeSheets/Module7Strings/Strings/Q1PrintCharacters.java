package PracticeSheets.Module7Strings.Strings;

public class Q1PrintCharacters {
    //Write a program that takes the input "Java" and prints each character on a new line.
    public static void main(String[] args) {
        String input = "Java";

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}
