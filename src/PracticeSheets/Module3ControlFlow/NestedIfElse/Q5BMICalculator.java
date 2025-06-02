package PracticeSheets.Module3ControlFlow.NestedIfElse;

import java.util.Scanner;

public class Q5BMICalculator {
    /*Write a program that takes BMI as input and classifies the person:
            < 18.5 → "Underweight"
            18.5–24.9 → "Normal"
            25–29.9 → "Overweight"
            30–34.9 → "Obese Class I"
            ≥35 → "Obese Class II"
    Input: BMI (double)
    Output: Category*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter BMI: ");
        double bmi = scanner.nextDouble();

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else if (bmi < 35) System.out.println("Obese Class I");
        else System.out.println("Obese Class II");
    }
}
