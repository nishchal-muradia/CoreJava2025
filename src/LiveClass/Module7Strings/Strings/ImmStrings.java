package LiveClass.Module7Strings.Strings;

public class ImmStrings {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;

        str1 = str1 + "World";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1==str2);




    }
}
