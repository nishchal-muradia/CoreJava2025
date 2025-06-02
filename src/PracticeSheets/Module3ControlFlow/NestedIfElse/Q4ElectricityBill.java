package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q4ElectricityBill {
    /*Write a program to calculate electricity bill based on units consumed:
            ≤ 100 units → ₹1 per unit
            101–200 units → ₹2 per unit
            201–300 units → ₹3 per unit
            300 units → ₹5 per unit
    Input: Units consumed
    Output: Total bill*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();
        int bill;

        if (units <= 100) bill = units * 1;
        else if (units <= 200) bill = units * 2;
        else if (units <= 300) bill = units * 3;
        else bill = units * 5;

        System.out.println("Total bill: ₹" + bill);
    }
}
