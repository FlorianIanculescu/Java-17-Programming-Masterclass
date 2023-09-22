import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println("myArray = " + Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum element = " + returnedMin);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {

        int minimumElemenet = Integer.MAX_VALUE;

        for(int el : array) {
            if (el < minimumElemenet) {
                minimumElemenet = el;
            }
        }

        return minimumElemenet;
    }
}