package PracticeSheets.Module6Arrays.forEachLoop;

public class Q5SquareAndPrint {
    //Given an integer array {2, 4, 6, 8}, use a for-each loop
    //to print the square of each number.
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println("Squares of elements:");
        for (int num : arr) {
            System.out.println(num + " squared = " + (num * num));
        }
    }
}
