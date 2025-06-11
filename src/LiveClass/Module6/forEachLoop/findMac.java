package LiveClass.Module6.forEachLoop;

public class findMac {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0};

        int max = arr[0];
        for(int val : arr){
            if(val> max){
                max= val;
            }
        }
        System.out.println(max);
    }




}
