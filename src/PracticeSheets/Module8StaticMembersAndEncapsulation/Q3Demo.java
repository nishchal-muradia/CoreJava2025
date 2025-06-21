package PracticeSheets.Module8StaticMembersAndEncapsulation;

class Q3Demo {
    //Q: Can the display() method access data? Why or why not?
    static int data = 50;  // static variable

    static void display() {  // static method
        System.out.println("Data: " + data);  // accessing static variable
    }

    public static void main(String[] args) {
        Q3Demo.display();  // calling static method using class name
    }
}


/*
Both data and display() are declared as static.
Static methods can directly access static variables because:
They belong to the class, not to any specific object.
Both exist at the class level, and are loaded into memory when the class is loaded.
*/
