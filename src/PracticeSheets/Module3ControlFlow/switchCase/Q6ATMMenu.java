package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q6ATMMenu {
    /*Write a program that displays an ATM menu with options: Check Balance,
    Withdraw, Deposit, Exit. Use switch-case to perform the selected operation.
    Input: Option (1–4)
    Output: Corresponding operation*/

    public static void main(String[] args) {
        double balance = 5000.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Balance: ₹" + balance); break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("New Balance: ₹" + balance);
                } else System.out.println("Insufficient Balance");
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("New Balance: ₹" + balance);
                break;
            case 4: System.out.println("Thank you!"); break;
            default: System.out.println("Invalid Option");
        }
    }
}
