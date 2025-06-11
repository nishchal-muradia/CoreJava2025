package LiveClass.Module5.Functions;

import LiveClass.Module02BasicConcepts.Add2Number;

public class ADD2Numbers {

    public int add(int a, int b) {
        int c = a + b;
        return c;

    }


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        ADD2Numbers an = new ADD2Numbers();
        int result = an.add(a, b);

        System.out.println(result);


    }
}
