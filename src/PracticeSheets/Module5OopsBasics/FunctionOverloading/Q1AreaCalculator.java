package PracticeSheets.Module5OopsBasics.FunctionOverloading;

public class Q1AreaCalculator {
    /*Write a class AreaCalculator with overloaded area() methods to compute the area of:
        a circle: area(double radius)
        a rectangle: area(double length, double breadth)
        a triangle: area(double base, double height)*/

    // Area of Circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return base * height; // fallback
        }
    }

    public static void main(String[] args) {
        Q1AreaCalculator calc = new Q1AreaCalculator();
        System.out.println("Circle Area: " + calc.area(5));
        System.out.println("Rectangle Area: " + calc.area(4, 6));
        System.out.println("Triangle Area: " + calc.area(10, 5, true));
    }
}
