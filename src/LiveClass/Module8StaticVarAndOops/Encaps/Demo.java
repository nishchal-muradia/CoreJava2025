package LiveClass.Module8StaticVarAndOops.Encaps;

class Student {
    private int id;
    private String name;
    private String year;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(5);
        s1.setName("Nishchal");
        s1.setYear("2025");

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getYear());



    }
}
