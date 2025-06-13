package LiveClass.Module7Strings.StringBuilderAndBuffers;

public class Demo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hey");
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.append("Bye"));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.insert(0, "Java"));

        String str = sb.toString();
        System.out.println(str);

        System.out.println("===============");

       StringBuilder stbr = new StringBuilder("Hey");
        System.out.println(stbr);

        System.out.println(stbr.capacity());

        System.out.println(stbr.append("Bye"));
        System.out.println(stbr.deleteCharAt(2));
        System.out.println(stbr.insert(0, "Java"));

        String str2 = stbr.toString();
        System.out.println(str2);



    }
}
