package LiveClass.Module6.Array;

import java.util.Scanner;

public class InputArrayPrint {

    public static void main(String[] args) {
        // creation of arrau
        int arr[] = new int[5];
        // taking input so created Scanner
        Scanner sc = new Scanner(System.in);

        // Take the input from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Number" + i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("==============");


        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
