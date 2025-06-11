package LiveClass.Module6.forEachLoop;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // using for loop
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);


        // using for each loop
        int result = 0;
        for (int num : arr) {
            result = result + num;
        }
        System.out.println(result);


        double doubleArray[] = {1.0, 2.0, 3.0, 4.0};

        double newSum = 0.0;
        for (double num : doubleArray) {
            newSum = newSum + num;
        }
        System.out.println(newSum);


    }
}
