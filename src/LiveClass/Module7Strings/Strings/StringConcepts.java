package LiveClass.Module7Strings.Strings;

public class StringConcepts {

    public static void main(String[] args) {
        String name = "nishchal";
        name = name + "Hey";
        System.out.println(name);


        String s1 = "Nishchal";
        String s2 = "Nishchal";

        System.out.println(s1==s2);



        String p = "Hey";
        p="Bye";
        String q = "Bye";
        System.out.println(p==q);

        System.out.println(p.equals(q));



    }
}
