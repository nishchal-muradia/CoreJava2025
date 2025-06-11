package PracticeSheets.Module6Arrays.Arrays;

public class Q12RowSum3x3 {
    //Find the row-wise sum of a 3x3 int matrix

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Row-wise sums:");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }
}
