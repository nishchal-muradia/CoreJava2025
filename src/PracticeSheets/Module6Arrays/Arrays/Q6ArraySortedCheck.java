package PracticeSheets.Module6Arrays.Arrays;

public class Q6ArraySortedCheck {
    //Check if a given int array is sorted in ascending order.
    //→ Input: {1, 2, 3, 5, 4} → Output: false

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Is array sorted in ascending order? " + isSorted);
    }
}
