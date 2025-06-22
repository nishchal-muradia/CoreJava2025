package PracticeSheets.Module9InheritanceAndPolymorphism.Inheritance;

/*
Create a class Animal with a method makeSound(). Inherit it in class Dog and
 override makeSound() to print "Bark".
*/

class Animal {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Q2Main2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // Output: Bark
    }
}
