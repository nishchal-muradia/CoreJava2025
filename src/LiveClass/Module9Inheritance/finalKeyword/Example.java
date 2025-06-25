package LiveClass.Module9Inheritance.finalKeyword;

class A {
    public   void fun() {
        System.out.println("Inside A's fun");
    }
}

class B extends A {
    public void fun() {
        System.out.println("Inside B's fun");
    }
}


public class Example {
    public static void main(String[] args) {
        B obj = new B();
        obj.fun();
    }
}
