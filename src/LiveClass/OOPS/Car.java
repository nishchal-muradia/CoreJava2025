package LiveClass.OOPS;

class Bmw {
    long modelNumber;
    String engineNumber;
    int price;

    public Bmw() {
        System.out.println("Default const");
    }

    public Bmw(long modelNumber, String engineNumber, int price) {
        this.modelNumber = modelNumber;
        this.engineNumber = engineNumber;
        this.price = price;
    }
}

public class Car {
    public static void main(String[] args) {
        Bmw obj = new Bmw();
        Bmw obj2 = new Bmw(123l, "M5", 20000000);
        System.out.println(obj2.engineNumber);

    }
}
