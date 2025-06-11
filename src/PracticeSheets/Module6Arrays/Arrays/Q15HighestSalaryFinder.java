package PracticeSheets.Module6Arrays.Arrays;

import java.util.Scanner;


//Create an Employee class with id and salary. Find the employee with the highest salary.
class Employee {
    int id;
    double salary;
}

public class Q15HighestSalaryFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        System.out.println("Enter details for 3 employees:");

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.print("Enter ID for employee " + (i + 1) + ": ");
            employees[i].id = scanner.nextInt();
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            employees[i].salary = scanner.nextDouble();
        }

        Employee highest = employees[0];
        for (Employee emp : employees) {
            if (emp.salary > highest.salary) {
                highest = emp;
            }
        }

        System.out.println("Employee with highest salary:");
        System.out.println("ID: " + highest.id + ", Salary: " + highest.salary);
    }
}
