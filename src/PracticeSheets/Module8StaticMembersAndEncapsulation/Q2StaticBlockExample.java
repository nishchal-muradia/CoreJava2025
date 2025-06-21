package PracticeSheets.Module8StaticMembersAndEncapsulation;

class Q2StaticBlockExample {
    //Q: What gets printed first and why?
    static int x;

    static {
        x = 10;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
    }
}

/*

Static blocks are used for initializing static variables or running startup code.

        The static block here sets x = 10 and prints "Static block executed".

Then main() prints "Value of x: 10".

*/
