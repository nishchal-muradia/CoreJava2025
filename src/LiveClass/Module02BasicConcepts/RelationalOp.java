package LiveClass.Module02BasicConcepts;

public class RelationalOp {

    public static void main(String[] args) {
        int a =5;
        int b =10;
        int c = 10;

        boolean ans = a>b;
        boolean ans2 = b>a;

        System.out.println("ans1 " + ans);
        System.out.println("ans2 " +ans2);

        boolean ans3 = a==b; // compare
        System.out.println("ans3 " +ans3);

        boolean ans4 = a==a;
        System.out.println("ans4 " +ans4);

        boolean ans5 = a!=b;
        System.out.println("ans5 " +ans5);

        boolean ans6 = b!=b;
        System.out.println("ans6 " +ans6);

        boolean ans7 = b<=c;
        System.out.println("ans7 " +ans7);

        boolean ans8 = b>=c;
        System.out.println("ans8 " +ans8);

        boolean ans9 = a<=c;
        System.out.println("ans9 " +ans9);

        boolean ans10 = a>=c;
        System.out.println("ans10 " +ans10);

        System.out.println("Direct print ans 10: "+ (a>=c));











    }
}
