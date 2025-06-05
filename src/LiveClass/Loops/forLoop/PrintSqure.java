package LiveClass.Loops.forLoop;

import java.util.Scanner;

public class PrintSqure {

    public void printSqure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the input");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {
        PrintSqure p = new PrintSqure();
        p.printSqure();
    }
}
