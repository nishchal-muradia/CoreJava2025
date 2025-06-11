package PracticeSheets.Module5OopsBasics.Functions;

public class Q3CheckEvenOdd {

    //Q: Write a function that takes an integer and returns true if it's even, otherwise false.

    // Function to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int number = 27;
        if (isEven(number)) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
}
