package LiveClass.Module6.Array;

public class ArrayBasics {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

       /* System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);*/

        int nums[] = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

       /* System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);*/

        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }










    }
}
