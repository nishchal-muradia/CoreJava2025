package LiveClass.Module5.functionOverloading;

public class PowerCalculator {

    public int calculate(int base) {
        return base * base;
    }

    public int calculate(int base, int power) {
        /*int result =1;
        for(int i=1; i<=power; i++){
            result= result*base;
        }
        return result;*/
        return (int) Math.pow(base, power);
    }

    public static void main(String[] args) {
        PowerCalculator p = new PowerCalculator();
        System.out.println(p.calculate(5));
        System.out.println(p.calculate(5, 3));

    }
}
