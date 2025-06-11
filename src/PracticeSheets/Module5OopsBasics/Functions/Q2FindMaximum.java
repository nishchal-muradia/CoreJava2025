package PracticeSheets.Module5OopsBasics.Functions;

public class Q2FindMaximum {
    //Q: Write a function that accepts two integers and returns the greater number.

    // Function to find the maximum of two numbers
    public static int findMaximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 72;
        int max = findMaximum(num1, num2);
        System.out.println("Maximum: " + max);
    }
}
