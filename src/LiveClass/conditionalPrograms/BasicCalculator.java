package LiveClass.conditionalPrograms;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String str = sc.next();
        double result = 0;



        switch (str){
            case "+": result =num1+ num2; break;
            case "-": result =num1- num2; break;
            case "*": result =num1* num2; break;
            case "/": 
                result= num2!=0 ? num1/num2: Double.NaN; break;
        }
        System.out.println("ANS: " + result);
    }
}
