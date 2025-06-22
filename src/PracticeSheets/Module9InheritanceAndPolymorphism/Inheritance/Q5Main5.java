package PracticeSheets.Module9InheritanceAndPolymorphism.Inheritance;

/*
Demonstrate multilevel inheritance with classes Shape → Rectangle → ColoredRectangle.
 Call methods of all classes using ColoredRectangle object.
*/

class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    void displayRectangle() {
        System.out.println("This is a rectangle");
    }
}

class ColoredRectangle extends Rectangle {
    void displayColor() {
        System.out.println("Color: Blue");
    }
}

public class Q5Main5 {
    public static void main(String[] args) {
        ColoredRectangle obj = new ColoredRectangle();
        obj.displayShape();
        obj.displayRectangle();
        obj.displayColor();
    }
}
