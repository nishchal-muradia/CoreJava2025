package LiveClass.Module9Inheritance;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}

class SuperCalculator extends Calculator {

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class UltraSuperCalculator extends SuperCalculator{
    public void getComplement() {
        System.out.println("I can give complement of a number");
    }
}

public class Demo {
    public static void main(String[] args) {
        UltraSuperCalculator s = new UltraSuperCalculator();
        System.out.println(s.multi(2, 4));
        System.out.println(s.div(4, 2));
        System.out.println(s.add(1, 2));
        System.out.println(s.sub(2, 1));
        s.getComplement();



    }

}
