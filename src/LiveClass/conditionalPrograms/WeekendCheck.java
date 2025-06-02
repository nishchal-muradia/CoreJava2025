package LiveClass.conditionalPrograms;

public class WeekendCheck {

    public static void main(String[] args) {
        String day = "SundAy";

        if(day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday")){
            System.out.println("WEEKEND");
        }
    }

}
