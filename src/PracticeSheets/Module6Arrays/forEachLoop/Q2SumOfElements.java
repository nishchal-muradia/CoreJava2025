package PracticeSheets.Module6Arrays.forEachLoop;

public class Q2SumOfElements {
    //Given a double array {2.5, 3.0, 4.5, 1.0}, calculate and
    // print the sum of all elements using a for-each loop.

    public static void main(String[] args) {
        double[] arr = {2.5, 3.0, 4.5, 1.0};
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
