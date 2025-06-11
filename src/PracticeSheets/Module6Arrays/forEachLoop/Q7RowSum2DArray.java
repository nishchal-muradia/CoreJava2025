package PracticeSheets.Module6Arrays.forEachLoop;

public class Q7RowSum2DArray {
    /*Given a 2D int array:
    int[][] matrix = {
            {1, 2},
            {3, 4},
            {5, 6}
    };
    Use nested for-each loops to print the sum of each row.*/

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int rowNumber = 1;
        for (int[] row : matrix) {
            int sum = 0;
            for (int val : row) {
                sum += val;
            }
            System.out.println("Sum of row " + rowNumber + ": " + sum);
            rowNumber++;
        }
    }
}

