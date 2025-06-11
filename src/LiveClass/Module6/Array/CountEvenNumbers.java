package LiveClass.Module6.Array;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 9, 10, 11, 12};

        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
