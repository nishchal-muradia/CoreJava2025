package LiveClass.Module8StaticVarAndOops.StaticVariable;

class CountClass {
    static int count = 0;

    public void callCount() {
        count++;
    }
}

public class Counters {

    public static void main(String[] args) {
        CountClass c1 = new CountClass();
        c1.callCount();


        CountClass c2 = new CountClass();
        c2.callCount();

        CountClass c3 = new CountClass();
        c3.callCount();

        System.out.println(CountClass.count);

    }
}
