package PracticeSheets.Module9InheritanceAndPolymorphism.Polymorphism;

//Create a class MathOperation with two add() methods (overloading):
// one for int, another for double. Show compile-time polymorphism.
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Q1Main1 {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println("Sum (int): " + obj.add(5, 10));         // 15
        System.out.println("Sum (double): " + obj.add(5.5, 2.3));   // 7.8
    }
}
