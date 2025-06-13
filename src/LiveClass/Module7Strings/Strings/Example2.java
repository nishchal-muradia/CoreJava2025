package LiveClass.Module7Strings.Strings;

public class Example2 {

    public static void main(String[] args) {
        String a = "hello";
        String b = "he" + "llo";
        String c = "he";
        String d = c + "llo";

        System.out.println(a == b);

        System.out.println(a==d);
        System.out.println(a.equals(d));
    }
}
