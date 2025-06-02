package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q7IncomeTax {
    /*Write a program to calculate income tax based on the following slabs:
            ≤ ₹2,50,000 → "No tax"
            ₹2,50,001 – ₹5,00,000 → "5% tax"
            ₹5,00,001 – ₹10,00,000 → "20% tax"
            ₹10,00,000 → "30% tax"
    Input: Annual income
    Output: Applicable tax rate*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        double income = scanner.nextDouble();

        if (income <= 250000) System.out.println("No tax");
        else if (income <= 500000) System.out.println("5% tax");
        else if (income <= 1000000) System.out.println("20% tax");
        else System.out.println("30% tax");
    }
}
