package LiveClass.Module6.Array;

public class TwoDArray {

    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 3;
        arr[1][3] = 4;

        arr[2][0] = 1;
        arr[2][1] = 2;
        arr[2][2] = 3;
        arr[2][3] = 4;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
