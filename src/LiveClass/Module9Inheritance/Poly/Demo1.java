package LiveClass.Module9Inheritance.Poly;


class A {
    // Method overlaoding.
    public void add() {
        System.out.println("Add");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.add(1, 2, 3));
    }
}
