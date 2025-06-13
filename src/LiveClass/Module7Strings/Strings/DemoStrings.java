package LiveClass.Module7Strings.Strings;

public class DemoStrings {

    public static void main(String[] args) {

        String str = "Hello Java";

        System.out.println(str);
        System.out.println("The length is " + str.length());
        System.out.println("The char at location 2 " + str.charAt(2));
        System.out.println("The substring " + str.substring(1,6));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5));
        System.out.println("trim = " + str.trim());
        System.out.println(str.contains("Java"));
        System.out.println(str.contains("Javaaaa"));
        System.out.println(str.isEmpty());
        System.out.println(str.equals("Hello Java"));
        System.out.println(str.equalsIgnoreCase("HeLLo Java"));
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("B"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.replace("Java", "Python"));
        System.out.println(str.replace("a", "z"));

        String[] parts = {"First", "Second", "Third"};

        for(String s :parts){
            System.out.println(s);
        }






    }
}
