package LiveClass.OOPS;


class Watch {

    int key;
    String name;
    public Watch() {
        System.out.println("default");
    }

    public Watch(int key, String name) {
        this.key = key;
        this.name = name;
    }
}

public class Dummy {
    Watch w = new Watch();


}
