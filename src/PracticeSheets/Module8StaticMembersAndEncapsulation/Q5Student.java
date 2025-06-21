package PracticeSheets.Module8StaticMembersAndEncapsulation;

/*
Task: Write a Java program with:
a static variable collegeName
a non-static variable studentName
a constructor that takes the student name
a static method to change the college name for all*/
class Q5Student {
    static String collegeName = "ABC College"; // static variable
    String studentName;                        // instance variable

    // Constructor to initialize student name
    Q5Student(String name) {
        studentName = name;
    }

    // Static method to change college name
    static void changeCollegeName(String newCollege) {
        collegeName = newCollege;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("---------------------------");
    }

    // Main method to test the program
    public static void main(String[] args) {
        Q5Student s1 = new Q5Student("Ravi");
        Q5Student s2 = new Q5Student("Anita");

        // Display before changing college name
        s1.displayInfo();
        s2.displayInfo();

        // Change college name using static method
        Q5Student.changeCollegeName("XYZ University");

        // Display after change
        s1.displayInfo();
        s2.displayInfo();
    }
}

