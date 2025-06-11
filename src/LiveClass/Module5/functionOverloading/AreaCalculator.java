package LiveClass.Module5.functionOverloading;

public class AreaCalculator {

    // area of circle
    public double area(double radius) {
        return Math.PI * radius * radius;

    }
    // area of rectangle
    public double area(double length, double breadth) {
        return length * breadth;

    }

    // area of a triangle
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return base * height;
        }
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        System.out.println("The ares of circle = " + ac.area(7.0));
        System.out.println("The ares of rectangle = " + ac.area(7.0, 5.0));
        System.out.println("The ares of triangle = " + ac.area(7.0, 5.0, true));

    }
}
