package LiveClass.Module9Inheritance.AccessModifiers.First;

public class A {
      protected void printFun() {
        System.out.println("I print ");
    }

    public static void main(String[] args) {
        A a = new A();
        a.printFun();
    }
}
