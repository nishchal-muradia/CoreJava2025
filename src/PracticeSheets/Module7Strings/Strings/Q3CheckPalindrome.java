package PracticeSheets.Module7Strings.Strings;

public class Q3CheckPalindrome {
    //Write a program that takes the input "madam" and checks if
    // the string is a palindrome or not.
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
