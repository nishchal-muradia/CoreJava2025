package LiveClass.Module7Strings.WrapperClasses;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World");
        System.out.println(str);


        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
