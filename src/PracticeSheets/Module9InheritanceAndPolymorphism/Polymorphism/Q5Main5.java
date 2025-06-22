package PracticeSheets.Module9InheritanceAndPolymorphism.Polymorphism;

//Create class Shape with method area(). Override it in Circle and Square.
// Call using Shape reference to different objects.
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

class Square extends Shape {
    @Override
    void area() {
        System.out.println("Area of Square = side²");
    }
}

public class Q5Main5 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();  // Area of Circle

        s = new Square();
        s.area();  // Area of Square
    }
}
