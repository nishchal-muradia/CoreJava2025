package LiveClass.Module7Strings.WrapperClasses;

public class ClassicExample {

    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;

        System.out.println(a==b);
        System.out.println(a.equals(b));


        Integer c = 120;
        Integer d = 120;
        System.out.println(c==d);
        System.out.println(c.equals(d));


        int e = 128;
        int f = 128;
        System.out.println(e==f);
    }
}
