import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("-".repeat(30));
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("-".repeat(30));

        anotherArray[0] = 1;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("-".repeat(30));

        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("-".repeat(30));
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}