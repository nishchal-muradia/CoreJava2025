package LiveClass.Module02BasicConcepts;

public class Bitwise {

    public static void main(String[] args) {

        int a = 0b1010;
        int b = 0b1100;

        int c = a & b;

        System.out.println("A & b will be : " + c);

        int d = a | b;
        System.out.println("A | b will be " + d);

        int e = ~a;
        System.out.println("Negate of a : " + e);

        int f = a^b;
        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);
        System.out.println("value of f " + f);


    }
}
