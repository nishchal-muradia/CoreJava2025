package LiveClass.Module5.functionOverloading;

public class Calculator {

    public void add() {
        System.out.println("Hey");
    }

    public int add(int a, int b) {
        return a + b;
    }



    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(3,4);
        double sum = calc.add(2, 4.0);
        System.out.println(sum);

    }
}
