package LiveClass.Module6.Array;

public class SumOfRows {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        for (int[] row : matrix) {
            int sum = 0;
            for (int val : row) {
                sum = sum + val;
            }
            System.out.println(sum);
        }


    }
}
