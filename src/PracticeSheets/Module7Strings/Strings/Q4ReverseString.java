package PracticeSheets.Module7Strings.Strings;

public class Q4ReverseString {
    //Write a program that takes the input "Fynd" and prints the reversed string.
    public static void main(String[] args) {
        String input = "Fynd";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
