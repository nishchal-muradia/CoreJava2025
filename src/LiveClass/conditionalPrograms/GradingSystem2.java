package LiveClass.conditionalPrograms;

public class GradingSystem2 {

    public static void main(String[] args) {
        int marks = 90;

        if (marks > 90) {
            System.out.println("Grade A");
        } else if (marks>= 80 && marks<90) {
            System.out.println("Grade B");
        }else {
            System.out.println("Thats it ");
        }


    }
}
