package PracticeSheets.Module9InheritanceAndPolymorphism.Inheritance;

/*
Q1: Create a class Person with name and age. Inherit it in class Employee
 and add salary. Write a method to display details from both classes.
*/

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Salary: " + salary);
    }
}

public class Q1Main1 {
    public static void main(String[] args) {
        Employee e = new Employee("John", 30, 50000.0);
        e.displayEmployeeDetails();
    }
}
