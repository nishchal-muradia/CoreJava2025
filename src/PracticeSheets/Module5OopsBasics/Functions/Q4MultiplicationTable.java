package PracticeSheets.Module5OopsBasics.Functions;

public class Q4MultiplicationTable {
    //Q4: Write a function that takes a number n and prints its
    // multiplication table up to 10.

    // Function to print multiplication table of a number up to 10
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Multiplication Table of " + number + ":");
        printMultiplicationTable(number);
    }
}
