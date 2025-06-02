package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q9SpeedCheck {
    /*Write a program that takes the vehicle speed as input and prints:
            ≤ 40 → "Safe speed"
            41–60 → "Drive carefully"
            61–80 → "Over-speeding! Warning"
            80 → "Challan will be issued"
    Input: Speed in km/h
    Output: Message based on speed*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle speed (km/h): ");
        int speed = scanner.nextInt();

        if (speed <= 40) System.out.println("Safe speed");
        else if (speed <= 60) System.out.println("Drive carefully");
        else if (speed <= 80) System.out.println("Over-speeding! Warning");
        else System.out.println("Challan will be issued");
    }
}

