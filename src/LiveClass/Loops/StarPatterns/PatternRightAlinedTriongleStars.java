package LiveClass.Loops.StarPatterns;

public class PatternRightAlinedTriongleStars {


    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print blank spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // go to next line
            System.out.println();
        }
    }
}
