package PracticeSheets.Module3ControlFlow.TerneryOperator;

import java.util.Scanner;

public class Q8LoginCheck {
    //Write a program that checks if a user is allowed to log in:
    //If username is not empty and password is not empty → "Login Allowed"
    //Else → "Login Denied"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String result = (!username.isEmpty() && !password.isEmpty()) ? "Login Allowed" : "Login Denied";
        System.out.println(result);
    }
}
