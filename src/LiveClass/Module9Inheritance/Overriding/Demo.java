package LiveClass.Module9Inheritance.Overriding;
class A {
    public void add() {
        System.out.println("Inside A's add");
    }

    public void sub() {
        System.out.println("Inside A s sub");
    }
}
class B extends A {

    public void mul() {
        System.out.println("Inside B s mul");
    }

    @Override
    public void add(){
        System.out.println("Inside B s add");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.add();
    }
}
