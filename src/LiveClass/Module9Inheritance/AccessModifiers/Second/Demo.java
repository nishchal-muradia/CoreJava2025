package LiveClass.Module9Inheritance.AccessModifiers.Second;

import LiveClass.Module9Inheritance.AccessModifiers.First.A;
import com.sun.org.apache.bcel.internal.generic.FSUB;



class SubClass extends A{
    protected void fun1(){
        printFun();
        System.out.println("Inside fun1");
    }

}
public class Demo {


    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.fun1();
    }
}
