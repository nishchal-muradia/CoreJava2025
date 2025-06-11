package LiveClass.Module6.Array;

public class LongestWord {

    public static void main(String[] args) {
        String[] words = {"Java", "Array", "Coding"};

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("The longest word is: " + longest);
    }
}
