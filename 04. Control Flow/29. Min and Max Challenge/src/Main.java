import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double min = 0;
        double max = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextEntry);
                if (loopCount == 0 || number < min) {
                    min = number;
                }
                if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("The minimum number entered is : " + min);
            System.out.println("The maximum number entered is : " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}