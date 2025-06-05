package LiveClass.Loops.forLoop;

import java.util.Scanner;

public class Print1toN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the input");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            System.out.println(i);
        }
    }
}
