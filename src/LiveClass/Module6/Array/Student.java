package LiveClass.Module6.Array;

public class Student {
    int id;
    int age;
    String name;


    public static void main(String[] args) {
        //int num[] = new int[3];
        Student st[] = new Student[3];
        // array of objects

        Student s1 = new Student();
        s1.age = 10;
        s1.name = "Nishchal";
        s1.id = 1;

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "Ram";
        s2.id = 2;

        Student s3 = new Student();
        s3.age = 30;
        s3.name = "Rama";
        s3.id = 3;

        st[0] = s1;
        st[1] = s2;
        st[2] = s3;

        System.out.println(st[0].name);
        System.out.println(st[0].id);
        System.out.println(st[0].age);

        for (int i = 0; i < st.length; i++) {
            System.out.print("id:" + st[i].id);
            System.out.print("age: " + st[i].age);
            System.out.print("name: " + st[i].name);
            System.out.println();
        }


    }
}
