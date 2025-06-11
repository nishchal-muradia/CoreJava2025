package PracticeSheets.Module5OopsBasics.Functions;

public class Q5UniqueDigitSumChecker {
    /*Write a function hasUniqueDigitSum(int num1, int num2) that:
        Calculates the sum of digits of both numbers.
        Returns true if the digit sums are not equal, false otherwise.*/

    // Function to check if digit sums of two numbers are different
    public static boolean hasUniqueDigitSum(int num1, int num2) {
        return digitSum(num1) != digitSum(num2);
    }

    // Helper function to calculate the sum of digits of a number
    private static int digitSum(int num) {
        int sum = 0;
        num = Math.abs(num); // Handle negative numbers
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int num1 = 123;  // digit sum = 6
        int num2 = 321;  // digit sum = 6
        boolean result = hasUniqueDigitSum(num1, num2);
        System.out.println("Has Unique Digit Sum? " + result);
    }
}
