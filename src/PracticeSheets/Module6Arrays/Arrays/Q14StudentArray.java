package PracticeSheets.Module6Arrays.Arrays;

import java.util.Scanner;

//Q:  Create a Student class with name and marks. Create an array of 3 students
//and print their data.
class Student {
    String name;
    int marks;

    void print() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Q14StudentArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.println("Enter details for 3 students:");

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i].name = scanner.nextLine();
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            students[i].marks = scanner.nextInt();
            scanner.nextLine(); // consume newline
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.print();
        }
    }
}
