import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0d;
        int countInteger = 1;

        do {
            System.out.println("Enter number #" + countInteger);
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                countInteger++;
                sum += number;
            } catch (NumberFormatException wrongInput) {
                System.out.println("Invalid number!");
            }

        } while (countInteger <= 5);

        System.out.println("The sum of the 5 numbers = : " + sum);
    }
}