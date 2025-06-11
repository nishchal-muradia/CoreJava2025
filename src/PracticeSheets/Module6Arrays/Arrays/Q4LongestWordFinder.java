package PracticeSheets.Module6Arrays.Arrays;

public class Q4LongestWordFinder {
    //Find the longest word in a String array.
    //→ Input: {"Java", "Array", "Programming"}

    public static void main(String[] args) {
        String[] words = {"Java", "Array", "Programming"};
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
