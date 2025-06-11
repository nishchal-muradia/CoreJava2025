package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

public class Q7EvenStars {
    //Print Stars in Even Numbers (2, 4, 6, 8, 10)

    //**
    //****
    //******
    //********
    //**********

    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j =1; j<=2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
