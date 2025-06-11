package PracticeSheets.Module6Arrays.Arrays;

public class Q5TrueCounter {
    //Write a program to count how many true values are there in a boolean array.
    //→ Input: {true, false, true, true} → Output: 3

    public static void main(String[] args) {
        boolean[] arr = {true, false, true, true};
        int count = 0;

        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }

        System.out.println("Number of true values: " + count);
    }
}

