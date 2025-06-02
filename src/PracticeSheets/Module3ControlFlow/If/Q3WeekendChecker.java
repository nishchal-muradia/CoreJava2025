package PracticeSheets.Module3ControlFlow.If;

public class Q3WeekendChecker {
    // Write a program that checks if a day is a weekend.
    // Input: day (string). If the day is "Saturday" or "Sunday", print "Weekend".
    public static void main(String[] args) {
        String day = "Sunday";

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        }
    }
}
