package LiveClass.Module5.Functions;

public class Calculations {

    public void add(){
        System.out.println("Hey everyone");
    }

    public int giftMe(){
        System.out.println("int type gift");
        return 0;
    }

    public int addition(int a, int b){
        int c =  a+b;
        return c;
    }

    public String printMyName(){
        String str = "Nishchal";
        return str;
    }




    public static void main(String[] args) {

        Calculations c = new Calculations();

        int a =10;
        int b =10;
        int result = c.addition(a, b);

        System.out.println(result);

        String  myName = c.printMyName();
        System.out.println(myName);



    }
}
