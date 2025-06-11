package PracticeSheets.Module6Arrays.forEachLoop;

public class Q4FindMaximum {
    //Given an integer array {10, 45, 23, 89, 12},
    // find the maximum element using a for-each loop.
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 12};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
