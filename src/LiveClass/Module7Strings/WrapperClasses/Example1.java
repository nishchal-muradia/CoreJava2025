package LiveClass.Module7Strings.WrapperClasses;

public class Example1 {

    public static void main(String[] args) {
        int num=5;

        Integer num1 = new Integer(num);
        // BOXING
        System.out.println(num1);

        Integer num2 = num;
        // auto boxing
        System.out.println(num2);

        // unboxing
        int num3 = num2.intValue();
        System.out.println("num3 = " + num3);

        int num4 = num2;
        // Auto unboxing
        System.out.println(num4);


        char c= 'q';
        Character ch = new Character('c');
        Boolean b = new Boolean(true);
        Double d = new Double(5.0);
        Float f = new Float(4.0f);





    }
}
