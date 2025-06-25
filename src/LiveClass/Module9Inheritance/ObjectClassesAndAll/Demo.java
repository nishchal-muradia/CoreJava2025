/*
package LiveClass.Module9Inheritance.ObjectClassesAndAll;


import java.util.Objects;

class A{
    int num;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiveClass.Module9Inheritance.ObjectClassesAndAll.Example.A a = (LiveClass.Module9Inheritance.ObjectClassesAndAll.Example.A) o;
        return num == a.num && Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}
public class Demo {
    public static void main(String[] args) {
        LiveClass.Module9Inheritance.ObjectClassesAndAll.Example.A obj1 = new LiveClass.Module9Inheritance.ObjectClassesAndAll.Example.A();
        obj1.num= 10;
        obj1.name= "Nishchal";
        System.out.println(obj1);

        LiveClass.Module9Inheritance.ObjectClassesAndAll.Example.A obj2 = new LiveClass.Module9Inheritance.ObjectClassesAndAll.Example.A();
        obj2.num=10;
        obj2.name="Nishchal";

        System.out.println(obj2);
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
*/
