public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(128, 23));
        System.out.println(hasSharedDigit(987, 452));
        System.out.println(hasSharedDigit(15, 275));

    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 < 0) || (number1 > 999) || (number2 < 0) || (number2 > 999))
            return false;

        int storedNumber2 = number2;
        while (number1 != 0) {

            while (number2 != 0) {
                if (number1 % 10 == number2 % 10) {
                    return true;
                }
                number2 /= 10;
            }
            number1 /= 10;
            number2 = storedNumber2;
        }
        return false;
    }
}