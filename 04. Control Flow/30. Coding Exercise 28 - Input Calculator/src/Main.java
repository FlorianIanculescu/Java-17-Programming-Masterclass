import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg;
        int count = 0;

        while (true) {
            System.out.println("Enter an integer number, or anything else to quit:");
            String nextEntry = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextEntry);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (count > 0) {
            avg = sum / count;
            System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }
}