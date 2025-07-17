package LiveClass.Exc;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int i=10;

        try {
            if(i>arr.length-1){
                throw new ArrayIndexOutOfBoundsException
                        ("Hey guys This is my exception");
            }
            System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Exception" + e);
        }
        System.out.println("Hey Nishchal");
    }
}
