package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q6LoginSystem {
   /* Write a program to simulate a login system.
    Input: A username and a password
    Output: If the username is "admin" and the password is "1234",
     print "Login successful"; otherwise, print "Invalid credentials"
*/    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}

