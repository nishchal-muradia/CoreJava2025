package PracticeSheets.Module6Arrays.Arrays;

public class Q11Matrix2x3 {
    // Create and display a 2x3 int matrix.

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("2x3 Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
