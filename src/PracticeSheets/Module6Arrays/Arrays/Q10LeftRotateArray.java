package PracticeSheets.Module6Arrays.Arrays;

public class Q10LeftRotateArray {
    //Write a program to rotate an array to the left by 1 position.
    //→ Input: {1, 2, 3, 4} → Output: {2, 3, 4, 1}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

