package LiveClass.Exc;

public class Demo {
    public static void main(String[] args) {
        int a=10;
        int b =0;

        try{
            if(b==0){
                throw new ArithmeticException();
            }
            int c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Exception " + e);
        }
        catch (Exception e){
            System.out.println("Any other exception");
        }
    }
}
