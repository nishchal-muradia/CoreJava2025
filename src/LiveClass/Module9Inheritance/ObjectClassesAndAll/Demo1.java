package LiveClass.Module9Inheritance.ObjectClassesAndAll;


import java.util.Objects;

class Student{
    int id;
    String name;
    String classNumber = "12";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(classNumber, student.classNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Demo1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Ram";

        Student s2 = new Student();
        s2.id = 1;
        s2.name = "Ram";

        System.out.println(s1.equals(s2));


    }
}
