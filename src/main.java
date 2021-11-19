import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            int dayAsNumber;
            try {
                dayAsNumber = Integer.parseInt(input);
                if (dayAsNumber >= 1 && dayAsNumber <= 7) {
                    System.out.println("Hello, today is " + getWeekDay(dayAsNumber));
                } else {
                    System.out.println("Please enter number in between 1-7");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number input please enter number in between 1-7");

            }
        }

    }

    private static String getWeekDay(int dayAsNumber) {
        return switch (dayAsNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 5 -> "Thursday";
            case 4 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Unknown day of week " + dayAsNumber);
        };
    }
}
