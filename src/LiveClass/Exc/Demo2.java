package LiveClass.Exc;

public class Demo2 {
    public void def() throws ArithmeticException {
        int i = 10 / 0;
    }

    public void abc() throws ArithmeticException {
        def();
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        try {
            d.abc();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic" + e);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
