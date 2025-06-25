package LiveClass.Module9Inheritance.ObjectClassesAndAll.Example;


class A {
    A() {
        System.out.println("inside default A");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.println("inside default B");
    }

    B(int x) {

        System.out.println("inside para B");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}
