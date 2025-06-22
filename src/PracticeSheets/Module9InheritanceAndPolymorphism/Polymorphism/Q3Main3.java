package PracticeSheets.Module9InheritanceAndPolymorphism.Polymorphism;

//Create a class Animal with method sound().
// Inherit in class Cat and override sound() to print "Meow".
// Show run-time polymorphism using a parent reference.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Q3Main3 {
    public static void main(String[] args) {
        Animal a = new Cat();  // Parent reference to child object
        a.sound();             // Output: Meow (runtime polymorphism)
    }
}

