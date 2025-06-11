package PracticeSheets.Module6Arrays.Arrays;

public class Q7SecondLargestFinder {
    //Find the second largest element in an int array

    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 3, 7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}

