package LiveClass.Module9Inheritance.Poly;

class X{
    public void add(){
        System.out.println("I am X's Add");
    }

}
class Y extends X{

    @Override
    public void add(){
        System.out.println("I am Y's add");
    }

}

public class Demo2 {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.add();
    }
}
