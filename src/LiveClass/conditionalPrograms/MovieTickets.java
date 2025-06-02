package LiveClass.conditionalPrograms;

import java.util.Scanner;

public class MovieTickets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basePrice = 200.0;

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter the day");
        String day = sc.next();

        double discount = 0;

        // Rule 1: age based discount
        if (age < 12 || age > 60) {
            discount = 0.50;
        }
        // 2. Day based discount
        if (day.equalsIgnoreCase("Wednesday")) {
            discount = Math.max(discount, 0.30);
        }

        double finalPrice = basePrice * (1 - discount);
        System.out.println("The final price is : " + finalPrice);

    }
}
