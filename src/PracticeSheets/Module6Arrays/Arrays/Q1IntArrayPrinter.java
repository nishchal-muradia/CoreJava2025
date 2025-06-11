package PracticeSheets.Module6Arrays.Arrays;

import java.util.Scanner;

public class Q1IntArrayPrinter {
    /*Create a program to read and print all elements of an int array.
            → Input: 5 integers. Output: print all elements.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

