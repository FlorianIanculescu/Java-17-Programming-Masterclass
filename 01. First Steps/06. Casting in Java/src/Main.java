public class Main {
    public static void main(String[] args) {

        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);

        long myLongValue = (myMinIntValue / 2);
        System.out.println(myLongValue);
    }
}