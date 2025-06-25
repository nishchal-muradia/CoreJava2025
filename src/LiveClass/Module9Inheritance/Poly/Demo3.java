package LiveClass.Module9Inheritance.Poly;

class Animal {
    public void walk() {
        System.out.println("Animal can walk");
    }
}

class Dog extends Animal {

    @Override
    public void walk() {
        System.out.println("Dog can walk with 4 legs with own style");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.walk();
    }


}
