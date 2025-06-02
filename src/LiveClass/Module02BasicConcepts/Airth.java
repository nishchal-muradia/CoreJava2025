package LiveClass.Module02BasicConcepts;

public class Airth {

    public static void main(String[] args) {

        int a = 10;
        int b =20;

        int add = a+b;
        int mul = a*b;
        int sub = a-b;
        int div = b/a;
        int mod = b%a;
        int mod2 = a%b;

        System.out.println(add);
        System.out.println(mul);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(mod2);

        System.out.println();
        System.out.println();


        int x =10;
        // x = x+5;
        x+=5;
        System.out.println(x);

        int y = 50;
        //y--;
        //y = y-1;

        //y = y-20;
        y -=20;
        System.out.println(y);

        System.out.println();
        System.out.println();




        //. POST inc
        int num1 = 100;
        int num2 = num1++;


        System.out.println("My number 2 :  "  + num2);
        System.out.println("My number 1 :  "  + num1);

        System.out.println();
        System.out.println();
        System.out.println();
        // PRE INC:

        int num3 = 100;
        int num4 = ++num3;

        System.out.println("My number 3 :  "  + num3);
        System.out.println("My number 4 :  "  + num4);




    }
}
