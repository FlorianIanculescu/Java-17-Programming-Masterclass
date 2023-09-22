public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1211));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int initialNumber = number;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return initialNumber == reverse;
    }
}