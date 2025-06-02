package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q9ProductBilling {
    // Write a program that accepts a product code (1–5), quantity,
    // and uses switch-case to calculate total price based on predefined product rates.
    //Input: Product code and quantity
    //Output: Total bill
    //Use switch to assign price per unit based on product code.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code (1–5): ");
        int code = sc.nextInt();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        int price = 0;
        switch(code) {
            case 1: price = 100; break;
            case 2: price = 200; break;
            case 3: price = 150; break;
            case 4: price = 250; break;
            case 5: price = 300; break;
            default:
                System.out.println("Invalid Product Code");
                return;
        }

        int total = price * qty;
        System.out.println("Total Bill: ₹" + total);
    }
}

