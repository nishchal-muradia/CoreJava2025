package LiveClass.conditionalPrograms;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();

       if(username.equals("admin") && password.equals("1234")){
           System.out.println("Login done");
       }else{
           System.out.println("Access Denied");
       }
    }
}
