package LiveClass.Module9Inheritance.thisAndSuper;

// Base class
class A {
    A() {
        this(4);
        System.out.println("Inside A");
    }

    A(int num) {
        System.out.println("Inside parameter A");
    }
}

//Derived Classz
class B extends A {
    B() {
        this(4);
        System.out.println("Inside B");
    }

    B(int num) {
        super();
        System.out.println("Inside parameter B");
    }

}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();


    }
}
