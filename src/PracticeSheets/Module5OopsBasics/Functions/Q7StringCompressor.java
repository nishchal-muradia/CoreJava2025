package PracticeSheets.Module5OopsBasics.Functions;

public class Q7StringCompressor {

    /*Write a function compress(String input) that converts "aaabbcdd"
     (Counts consecutive repeating characters.)*/

    // Function to compress a string by counting consecutive characters
    public static String compress(String input) {
        if (input == null || input.isEmpty()) {return "";}

        StringBuilder result = new StringBuilder();
        int count = 1;
        char current = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
            } else {
                result.append(current).append(count);
                current = input.charAt(i);
                count = 1;
            }
        }

        result.append(current).append(count); // append last group
        return result.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input = "aaabbcdd";
        String compressed = compress(input);
        System.out.println("Compressed: " + compressed);
    }
}
