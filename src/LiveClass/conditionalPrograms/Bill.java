package LiveClass.conditionalPrograms;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units");

        int units = sc.nextInt();

        int billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1;
        } else if (units <= 200) {
            billAmount = units * 2;
        } else if (units <= 300) {
            billAmount = units * 3;
        } else {
            billAmount = units * 5;
        }

        System.out.println("Bill is : " + billAmount + "Rs.");
    }
}
