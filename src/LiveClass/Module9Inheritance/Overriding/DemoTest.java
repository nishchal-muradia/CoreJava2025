package LiveClass.Module9Inheritance.Overriding;




class Car {
    public void speed() {
        System.out.println("global Car limit");
    }
}

class Bmw extends Car {

    @Override
    public void speed() {
        System.out.println("BMW car Limit");
    }
}


public class DemoTest {
    public static void main(String[] args) {
        Bmw obj = new Bmw();
        obj.speed();
    }
}
