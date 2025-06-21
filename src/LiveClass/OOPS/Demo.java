package LiveClass.OOPS;

class Student {
    int id;
    String name;
    String schoolName;

    // DEFAULT ONE
    public Student() {
    }

    // parameterized CONSTRUCTOR
    public Student(int id, String name, String schoolName) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Ram", "FYND");
    }
}
