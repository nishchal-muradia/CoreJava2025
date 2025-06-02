package PracticeSheets.Module3ControlFlow.switchCase;

import java.util.Scanner;

public class Q10TravelPackage {
   /* Write a program to select a travel package:
            1 → Goa (₹15,000)
            2 → Manali (₹10,000)
            3 → Kerala (₹12,000)
            4 → Exit
    Calculate cost for n travelers and apply discount:
    If n > 5 → 10% discount
    Use switch-case for destination and if for discount*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPerPerson = 0;

        System.out.println("1. Goa (₹15000)\n2. Manali (₹10000)\n3. Kerala (₹12000)\n4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: costPerPerson = 15000; break;
            case 2: costPerPerson = 10000; break;
            case 3: costPerPerson = 12000; break;
            case 4:
                System.out.println("Thank you!");
                return;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.print("Enter number of travelers: ");
        int travelers = sc.nextInt();
        double totalCost = costPerPerson * travelers;

        if (travelers > 5) {
            totalCost *= 0.9; // 10% discount
        }

        System.out.println("Total Cost: ₹" + totalCost);
    }
}
