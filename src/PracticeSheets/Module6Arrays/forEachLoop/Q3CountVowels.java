package PracticeSheets.Module6Arrays.forEachLoop;

public class Q3CountVowels {
    //Given a char array {'a', 'e', 'i', 'o', 'u', 'b', 'c'},
    //count how many vowels are present using a for-each loop
    public static void main(String[] args) {
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'b', 'c'};
        int count = 0;
        for (char ch : chars) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}

