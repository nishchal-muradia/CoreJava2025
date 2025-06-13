package LiveClass.Module7Strings.Strings;

public class Example1 {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = new String("hello");
        String d = new String("hello");

        System.out.println(c==d);

        System.out.println(c.equals(d));






    }

}
