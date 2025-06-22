package PracticeSheets.Module9InheritanceAndPolymorphism.Inheritance;

/*
Write a program with base class Vehicle and derived class Car
 that adds a method fuelType(). Show single inheritance.
*/
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Fuel Type: Petrol");
    }
}

public class Q4Main4 {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fuelType();
    }
}
