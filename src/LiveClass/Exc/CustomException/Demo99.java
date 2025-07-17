package LiveClass.Exc.CustomException;

public class Demo99 {

    public static void main(String[] args) {
        int i = 10;
        try {
            if (i > 5) {
                throw new FyndException("value of i is > 5");
            }
        } catch (FyndException e) {
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hey");
    }
}
