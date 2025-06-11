package PracticeSheets.Module6Arrays.forEachLoop;

public class Q1PrintAllElements {
    //Given an integer array {1, 2, 3, 4, 5}, use a for-each loop to print all elements.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Elements in the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

