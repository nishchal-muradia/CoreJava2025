package PracticeSheets.Module5OopsBasics.FunctionOverloading;

public class Q5BookingSystem {

   /* Create a class BookingSystem with multiple book() methods:
    book(String name) – for normal booking
    book(String name, int members) – for group booking
    book(String name, boolean isVIP) – for VIP booking
    book(String name, int members, boolean isVIP) – group VIP booking*/

    public void book(String name) {
        System.out.println("Booking for " + name);
    }

    public void book(String name, int members) {
        System.out.println("Group booking for " + name +
                " with " + members + " members.");
    }

    public void book(String name, boolean isVIP) {
        if (isVIP) {
            System.out.println("VIP booking for " + name);
        } else {
            System.out.println("Standard booking for " + name);
        }
    }

    public void book(String name, int members, boolean isVIP) {
        if (isVIP) {
            System.out.println("Group VIP booking for " + name +
                    " with " + members + " members.");
        } else {
            System.out.println("Group standard booking for " +
                    name + " with " + members + " members.");
        }
    }

    public static void main(String[] args) {
        Q5BookingSystem system = new Q5BookingSystem();
        system.book("Alice");
        system.book("Bob", 4);
        system.book("Charlie", true);
        system.book("David", 6, true);
    }
}
