package PracticeSheets.Module7Strings.Strings;

public class Q8CompareStrings {
    //Write a program that takes two strings: "Apple" and "apple", and checks if they are equal:
    //Case-sensitive comparison
    //Case-insensitive comparison

    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "apple";

        // Case-sensitive
        if (str1.equals(str2)) {
            System.out.println("Case-sensitive: Equal");
        } else {
            System.out.println("Case-sensitive: Not equal");
        }

        // Case-insensitive
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Case-insensitive: Equal");
        } else {
            System.out.println("Case-insensitive: Not equal");
        }
    }
}
