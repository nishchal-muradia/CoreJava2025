package PracticeSheets.Module8StaticMembersAndEncapsulation;


//Modify the above Employee class so that:
//salary cannot be less than 10,000
//If such a value is passed, set default 10,000
public class Q8EmployeeValidationTest {
    public static void main(String[] args) {
        // Case 1: Valid salary
        MyEmployee emp1 = new MyEmployee("Ravi", 45000);
        emp1.displayDetails();

        System.out.println();

        // Case 2: Invalid salary (less than 10000)
        MyEmployee emp2 = new MyEmployee("Anita", 8000); // should default to 10000
        emp2.displayDetails();
    }
}

class MyEmployee {
    private String name;
    private double salary;

    // Constructor with validation
    public MyEmployee(String name, double salary) {
        this.name = name;
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("⚠️  Salary for " + name + " is too low. Setting to minimum ₹10,000.");
            this.salary = 10000;
        }
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : ₹" + salary);
    }
}
