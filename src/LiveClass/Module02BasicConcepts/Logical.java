package LiveClass.Module02BasicConcepts;

public class Logical {

    public static void main(String[] args) {

        int a =10;  int b =20; int c = 30;

        System.out.println("--------------AND");
        boolean ans1 = (a>b ) && (b>c);
        System.out.println("ans1 = " + ans1);

        boolean ans2 = (a<b ) && (b>c);
        System.out.println("ans2 = " + ans2);

        boolean ans3 = (a<b ) && (b<c);
        System.out.println("ans3 = " + ans3);

        boolean ans4 = (a>b ) && (b>c);
        System.out.println("ans14= " + ans4);



        System.out.println("--------------OR");
        boolean ans5 = (a>b ) ||  (b>c);
        System.out.println("ans5 = " + ans5);


        boolean ans6 = (a<b ) || (b>c);
        System.out.println("ans6 = " + ans6);


        boolean ans7 = (a<b ) ||  (b<c);
        System.out.println("ans7 = " + ans7);


        boolean ans8 = (a>b ) ||  (b>c);

        System.out.println("ans8= " + ans8);


        boolean num1 = false;

        System.out.println("Not number1:" +!num1);

        boolean num2 = true;
        System.out.println("Not number2:" +!num2);





    }
}
