package LiveClass.Module6.Array;

public class TrueCounter {

    public static void main(String[] args) {
        boolean arr[] = {true, false, true, true, false};

        int counter = 0;


        for (boolean val : arr) {
            if (val) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
