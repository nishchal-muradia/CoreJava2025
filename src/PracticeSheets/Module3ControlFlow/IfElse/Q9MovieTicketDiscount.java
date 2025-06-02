package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q9MovieTicketDiscount {
    /*Write a program to calculate movie ticket price after applying discounts.
    Input:
        Age of the customer
        Day of the week
    Discount Rules:
    If age < 12 or age > 60 → apply 50% discount
    If day is "Wednesday" → apply 30% discount
    Discounts don’t combine — choose the best one
    Output: Final ticket price after applying the appropriate discount*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TICKET_PRICE = 200.0;

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.print("Enter day of the week: ");
        String day = scanner.nextLine();

        double discount = 0;

        if (age < 12 || age > 60) {
            discount = 0.5; // 50% discount
        }

        if (day.equalsIgnoreCase("Wednesday")) {
            // Apply max discount only
            discount = Math.max(discount, 0.3); // 30% discount
        }

        double finalPrice = TICKET_PRICE * (1 - discount);
        System.out.println("Final ticket price: ₹" + finalPrice);
    }
}
