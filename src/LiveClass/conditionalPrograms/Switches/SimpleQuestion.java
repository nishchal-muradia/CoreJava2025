package LiveClass.conditionalPrograms.Switches;

import java.util.Scanner;

public class SimpleQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:System.out.println("Number 1"); break;
            case 2: System.out.println("Number 2"); break;
            case 3: System.out.println("Number 3"); break;
            case 4: System.out.println("Number 4"); break;
            case 5: System.out.println("Number 5"); break;
            default: System.out.println("Invalid Number");

        }
    }
}
