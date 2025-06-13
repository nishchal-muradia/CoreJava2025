package PracticeSheets.Module7Strings.Strings;

public class Q10ReplaceCharacter {
    //Write a program that takes the input "banana" and replaces
    // all occurrences of 'a' with 'o', resulting in "bonono".
    public static void main(String[] args) {
        String input = "banana";
        String replaced = input.replace('a', 'o');

        System.out.println("After replacement: " + replaced);
    }
}
