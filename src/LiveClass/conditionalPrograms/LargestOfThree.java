package LiveClass.conditionalPrograms;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        if(a>=b && a >=c){
            System.out.println("a is larger");
        }
        else if(b>=a && b>=c){
            System.out.println("B is larger");
        }else{
            System.out.println("c is larger");
        }
    }
}
