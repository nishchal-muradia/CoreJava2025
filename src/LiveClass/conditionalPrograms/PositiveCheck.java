package LiveClass.conditionalPrograms;

import java.util.Scanner;

public class PositiveCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num>0){
            System.out.println("The number is positive");
        }
    }
}
