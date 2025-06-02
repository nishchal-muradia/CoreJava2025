package LiveClass.conditionalPrograms.TerneryPrograms;

import java.util.Scanner;

public class EvenOddCheckWithTernery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String ans = (num%2==0)? "EVEN": "ODD";


        System.out.println(ans);

    }
}
