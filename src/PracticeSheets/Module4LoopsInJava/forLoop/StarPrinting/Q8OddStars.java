package PracticeSheets.Module4LoopsInJava.forLoop.StarPrinting;

public class Q8OddStars {
    //Print Stars in Odd Numbers (1, 3, 5, 7, 9)

    //*
    //***
    //*****
    //*******
    //*********
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
