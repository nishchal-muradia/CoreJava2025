package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q10WaterBill {
    /*Write a program to calculate water charges:
            ≤ 30 liters → "₹10"
            31–100 liters → "₹20"
            101–200 liters → "₹40"
            200 liters → "₹70"
    Input: Water consumption in liters
    Output: Water bill amount*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter water consumption in liters: ");
        int liters = scanner.nextInt();

        int bill;
        if (liters <= 30) bill = 10;
        else if (liters <= 100) bill = 20;
        else if (liters <= 200) bill = 40;
        else bill = 70;

        System.out.println("Water bill amount: ₹" + bill);
    }
}
