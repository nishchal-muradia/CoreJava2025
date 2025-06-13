package PracticeSheets.Module7Strings.Strings;

public class Q2CountCharacters {
    //Write a program that takes the input "Hello World" and
    // counts the total number of characters, excluding spaces.
    public static void main(String[] args) {
        String input = "Hello World";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total characters (excluding spaces): " + count);
    }
}
