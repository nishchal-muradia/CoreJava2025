package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q3TemperatureCheck {
    /*Write a program to display a message based on temperature:
    Temp < 0 → "Freezing cold"
            0–10 → "Very Cold"
            11–20 → "Cold"
            21–30 → "Pleasant"
            31–40 → "Hot"
            40 → "Very Hot"
    Input: Temperature (integer)
    Output: Message*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = scanner.nextInt();

        if (temp < 0) System.out.println("Freezing cold");
        else if (temp <= 10) System.out.println("Very Cold");
        else if (temp <= 20) System.out.println("Cold");
        else if (temp <= 30) System.out.println("Pleasant");
        else if (temp <= 40) System.out.println("Hot");
        else System.out.println("Very Hot");
    }
}
