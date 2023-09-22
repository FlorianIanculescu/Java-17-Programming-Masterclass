public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of digits for 1234 = " + sumDigits(1234));
        System.out.println("The sum of digits for -125 = " + sumDigits(-125));
        System.out.println("The sum of digits for 4 = " + sumDigits(4));
        System.out.println("The sum of digits for 32123 = " + sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}