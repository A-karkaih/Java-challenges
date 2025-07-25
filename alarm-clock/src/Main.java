import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src\\Cash.wav"; // You can change or ask the user for this

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);

                if (alarmTime.isBefore(LocalTime.now())) {
                    System.out.println("The time is in the past. Please enter a future time.");
                    alarmTime = null;
                } else {
                    System.out.println("Alarm set for " + alarmTime);
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

        try {
            alarmThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}