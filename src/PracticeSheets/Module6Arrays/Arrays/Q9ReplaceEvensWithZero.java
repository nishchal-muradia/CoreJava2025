package PracticeSheets.Module6Arrays.Arrays;

public class Q9ReplaceEvensWithZero {
    //Replace all even numbers with 0 in an int array

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }

        System.out.print("Updated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
