package LiveClass.OOPS.AnynObjects;

class A {
    public void printThis() {
        System.out.println("inside print this");
    }

    public A(){
        System.out.println("Inside my constructor");
    }


}

public class Demo {
    public static void main(String[] args) {

        new A().printThis();

        new A().printThis();

    }

}
