package PracticeSheets.Module8StaticMembersAndEncapsulation;

class Q1Counter {
    //Q: What will be the output? Explain why.

    static int count = 0; // static variable shared by all objects

    Q1Counter() {
        count++; // increment when constructor is called
    }

    public static void main(String[] args) {
        new Q1Counter(); // count becomes 1
        new Q1Counter(); // count becomes 2
        new Q1Counter(); // count becomes 3
        System.out.println("Count: " + count); // prints 3
    }


}

/*ANS:
count is a static variable, meaning it's shared by
 all instances of the Counter class.
Each time a new object is created using new Counter(),
 the constructor is called and count is incremented.
Since three objects are created, count++ executes 3 times.*/
