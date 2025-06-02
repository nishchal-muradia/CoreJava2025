package LiveClass.Loops.WhileLoop;

public class PowerQuestion {

    public static void main(String[] args) {
        int x = 2;
        int n = 4;

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = (int)(sum + Math.pow(x, i));
            i++;
        }

        System.out.println("sum " + sum);
    }
}
