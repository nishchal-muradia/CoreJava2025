package PracticeSheets.Module9InheritanceAndPolymorphism.Inheritance;

class A {/*
Create a class A, inherit it in B, then B in C (Multilevel).
 Add one method in each class and call all from C object
*/

    void methodA() {
        System.out.println("Method from class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Method from class B");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Method from class C");
    }
}

public class Q3Main3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
