package LiveClass.Module6.forEachLoop;

public class CountVowels {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'i', 'o'};


        int count = 0;
        for (char ch : arr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;  // count = count+1;
            }
        }
        System.out.println("Number of vowels are " + count);
    }
}
