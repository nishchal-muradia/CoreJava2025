package PracticeSheets.Module5OopsBasics.Functions;

public class Q6PasswordStrengthEvaluator {
    /*Write a function isStrongPassword(String password) that returns true if:
    It is at least 8 characters long
    Contains at least one digit, one uppercase, one lowercase, and one special character*/


    // Function to check if password is strong
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;  // Any non-letter, non-digit character
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String password = "Abc@1234";
        boolean result = isStrongPassword(password);
        System.out.println("Is Strong Password? " + result);
    }
}

