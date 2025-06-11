package PracticeSheets.Module5OopsBasics.FunctionOverloading;

public class Q2Printer {
    /*Print Utility (Overload for different data types)
    Create a class Printer with an overloaded print() method:
        print(int value)
        print(String message)
        print(double value)
        print(char c)*/

    public void print(int value) {
        System.out.println("Integer: " + value);
    }

    public void print(String message) {
        System.out.println("String: " + message);
    }

    public void print(double value) {
        System.out.println("Double: " + value);
    }

    public void print(char c) {
        System.out.println("Char: " + c);
    }

    public static void main(String[] args) {
        Q2Printer p = new Q2Printer();
        p.print(10);
        p.print("Hello");
        p.print(3.14);
        p.print('A');
    }
}
