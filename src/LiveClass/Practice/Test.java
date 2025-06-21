package LiveClass.Practice;

public class Test {
    static int count = 0;

    Test() {
        count++;
        System.out.println("Object " + count);
    }

    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();
    }
}
