package PracticeSheets.Module8StaticMembersAndEncapsulation;


/*Create a class Employee with:
        private fields name, salary
constructor to initialize the values
method to display the employee details
Q: Can these fields be accessed directly in main?*/

public class Q7EmployeeTest {
    public static void main(String[] args) {
        // Creating Employee object
        MyEmployee emp1 = new MyEmployee("Ravi Kumar", 45000);

        // Displaying employee details
        emp1.displayDetails();
    }
}

// Employee class definition
class Employee {
    // 🔒 Private fields
    private String name;
    private double salary;

    // ✅ Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // ✅ Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : ₹" + salary);
    }
}

//❌ Answer: No, these fields in questions cannot be accessed directly.