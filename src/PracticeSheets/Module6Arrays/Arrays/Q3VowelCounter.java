package PracticeSheets.Module6Arrays.Arrays;

public class Q3VowelCounter {
    // Count the number of vowels in a char array.
    //→ Input: {'a','b','c','e','i'} → Output: 3

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'e', 'i'};
        int count = 0;

        for (char ch : arr) {
            if (isVowel(ch)) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

