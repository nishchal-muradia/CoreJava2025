package PracticeSheets.Module9InheritanceAndPolymorphism.Polymorphism;

//Create a class Printer with method print(String), print(int),
// and print(double). Demonstrate method overloading.
class Printer {
    void print(String s) {
        System.out.println("String: " + s);
    }

    void print(int i) {
        System.out.println("Integer: " + i);
    }

    void print(double d) {
        System.out.println("Double: " + d);
    }
}

public class Q2Main2 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");
        p.print(100);
        p.print(12.34);
    }
}
