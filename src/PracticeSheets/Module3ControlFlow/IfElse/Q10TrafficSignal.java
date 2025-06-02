package PracticeSheets.Module3ControlFlow.IfElse;

import java.util.Scanner;

public class Q10TrafficSignal {
   /* Write a program to decide whether a vehicle should go or stop based on signal color and vehicle type.
    Input:
        Signal color ("red", "yellow", "green")
        Vehicle type ("ambulance" or "normal")
    Rules:
        If signal is "red" and vehicle is "normal" → Stop
        If signal is "yellow" → Slow down
        If vehicle is "ambulance" → Go regardless of signal
        Else → Go
    Output: Appropriate action: "Stop", "Go", or "Slow down"*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter signal color (red/yellow/green): ");
        String signal = scanner.nextLine().toLowerCase();

        System.out.print("Enter vehicle type (ambulance/normal): ");
        String vehicle = scanner.nextLine().toLowerCase();

        if (vehicle.equals("ambulance")) {
            System.out.println("Go");
        } else if (signal.equals("red") && vehicle.equals("normal")) {
            System.out.println("Stop");
        } else if (signal.equals("yellow")) {
            System.out.println("Slow down");
        } else {
            System.out.println("Go");
        }
    }
}
