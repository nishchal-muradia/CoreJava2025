package PracticeSheets.Module7Strings.Strings;

public class Q5CountVowelsConsonants {
    //Write a program that takes the input "Programming"
    // and counts the number of vowels and consonants.
    public static void main(String[] args) {
        String input = "Programming".toLowerCase();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

