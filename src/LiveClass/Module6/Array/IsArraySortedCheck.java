package LiveClass.Module6.Array;

public class IsArraySortedCheck {

    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 5, 6};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }


        if (isSorted) {
            System.out.println("This array is in ascending order");
        } else {
            System.out.println("This array is not in ascending order");
        }
    }
}
