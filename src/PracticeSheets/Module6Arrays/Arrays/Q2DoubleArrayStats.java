package PracticeSheets.Module6Arrays.Arrays;

import java.util.Scanner;

public class Q2DoubleArrayStats {
    //Find the sum and average of elements in a double array.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[5];
        double sum = 0;

        System.out.println("Enter 5 double values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        double average = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
