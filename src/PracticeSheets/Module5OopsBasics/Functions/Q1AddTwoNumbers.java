package PracticeSheets.Module5OopsBasics.Functions;

public class Q1AddTwoNumbers {
    //Q: Write a function that takes two numbers as input and returns their sum.

    // Function to add two numbers
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = addTwoNumbers(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
