package LiveClass.Module9Inheritance.SingleLevel;

class GodsCreature {
    public void existOnEarth() {
        System.out.println("I exist on earth");
    }
}
class Animal extends  GodsCreature{
    public void eat() {
        System.out.println("i can eat");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark");
    }
}
public class DemoRunner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.existOnEarth();
    }

}
