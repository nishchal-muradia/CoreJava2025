package PracticeSheets.Module6Arrays.forEachLoop;

public class Q6CountEvenNumbers {
    //Given an integer array {1, 4, 6, 9, 10, 13},
    //count how many even numbers are present using a for-each loop.
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 9, 10, 13};
        int evenCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
    }
}
