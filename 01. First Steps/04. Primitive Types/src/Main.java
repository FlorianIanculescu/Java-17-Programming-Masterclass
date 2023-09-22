public class Main {
    public static void main(String[] args) {

        int myValue = 10000;
        System.out.println(myValue);

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMaxIntValue);

        System.out.println("Integer Minimum Value =" + myMinIntValue);

        System.out.println("Integer Minimum Value =" + Integer.MIN_VALUE);

        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

    }
}