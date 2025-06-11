package PracticeSheets.Module5OopsBasics.FunctionOverloading;

public class Q3Calculator {
       /* Calculator with Optional Power (Varying Parameters)
    Create a class Calculator with an overloaded method
     calculate(int base) and calculate(int
    First version returns base * base
    Second version returns base ^ power*/

    public int calculate(int base) {
        return base * base;
    }

    public int calculate(int base, int power) {
        return (int) Math.pow(base, power);
    }

    public static void main(String[] args) {
        Q3Calculator calc = new Q3Calculator();
        System.out.println("Base^2: " + calc.calculate(4));           // 16
        System.out.println("Base^Power: " + calc.calculate(2, 5));    // 32
    }
}
