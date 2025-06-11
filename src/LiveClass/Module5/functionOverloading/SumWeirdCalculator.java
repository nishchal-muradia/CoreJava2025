package LiveClass.Module5.functionOverloading;

public class SumWeirdCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int... numbers) {

        return 0;
    }

    public static void main(String[] args) {
        SumWeirdCalculator s= new SumWeirdCalculator();
        s.add(1,2);
        System.out.println(s.add(1,2,3));
        s.add(1,2,3,4,5,6);

    }
}
