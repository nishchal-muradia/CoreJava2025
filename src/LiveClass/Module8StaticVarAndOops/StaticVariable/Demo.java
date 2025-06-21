package LiveClass.Module8StaticVarAndOops.StaticVariable;

class Student {
    int id;
    String name;
    static String school;

    static {
        school = "FYND";
    }

    // non static method
    public void show() {
        System.out.println("id= " + id +
                " name= " + name +
                "School= " + school);
    }

    // static method
    public static void newShow(Student s1) {
        System.out.println("Hey, I am static");
        System.out.println(s1.id+ s1.name + school);

    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Ram";
        s1.show();
        Student.newShow(s1);

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Shyam";
        s2.show();
        Student.newShow(s2);


    }
}
