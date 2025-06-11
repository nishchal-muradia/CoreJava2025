package LiveClass.Module6.stackAndHeap;


class Calculator {

    int num;  // instance variable
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}


public class Demo {

    public static void main(String[] args) {

        int data = 1;
        Calculator obj = new Calculator();
        int result = obj.add(5, 10);
        System.out.println(result);

        Calculator obj2 = new Calculator();


    }
}
