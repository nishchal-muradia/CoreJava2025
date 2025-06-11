package PracticeSheets.Module6Arrays.Arrays;

public class Q8StringArrayReverser {
    // Reverse a String array without using any inbuilt function.

    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++", "Ruby"};

        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

