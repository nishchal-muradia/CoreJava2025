package PracticeSheets.Module5OopsBasics.FunctionOverloading;

public class Q4Summer {
    /*Sum of Numbers (Variable-length arguments)
    Create a method sum(int a, int b) and another method sum(int... numbers).
    The first sums two numbers.
    The second sums an arbitrary number of integers.
    Test case: sum(2,3) and sum(1,2,3,4,5,6).*/

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Q4Summer s = new Q4Summer();
        System.out.println("Sum of 2 and 3: " + s.sum(2, 3));
        System.out.println("Sum of many: " + s.sum(1, 2, 3, 4, 5, 6));
    }
}
