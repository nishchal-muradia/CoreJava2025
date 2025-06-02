package LiveClass.conditionalPrograms;

public class TernaryQuestions {

    public static void main(String[] args) {
        int num = 5;
        String result = (num % 2 == 0) ? "EVEN" : "ODD";
        //System.out.println(result);

        int a = 4;
        int b = 5;
        int c = a > b ? a : b;
        //System.out.println(c);


        int number = 0;
        String status = (number > 0) ? "POSITIVE" : (number < 0 ? "NEGATIVE" : "ZERO");
        //System.out.println(status);

        int p =3; int q = 9; int r=5;
        int min = (p<q)? (p<r? p: r) : (q<r?q:r);
        System.out.println(min);


        String username = "admin";
        String password = "1234";
        String check = (! username.isEmpty() && ! password.isEmpty())? "login": "NO";







    }
}
