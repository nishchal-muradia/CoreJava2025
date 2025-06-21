package PracticeSheets.Module8StaticMembersAndEncapsulation;

class Q4Example {
    static int x = 10; // static variable
    int y = 5;         // non-static (instance) variable

    void show() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        Q4Example e = new Q4Example();
        e.show();
    }
}

