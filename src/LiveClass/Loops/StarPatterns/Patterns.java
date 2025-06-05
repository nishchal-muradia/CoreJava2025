package LiveClass.Loops.StarPatterns;

public class Patterns {

    public static void main(String[] args) {


        System.out.println("****");

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
