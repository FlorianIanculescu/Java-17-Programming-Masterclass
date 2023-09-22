public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if (isValid(n1) == false || isValid(n2) == false || isValid(n3) == false) {
            return false;
        }

        if (n1 % 10 == n2 % 10 || n1 % 10 == n3 % 10 || n2 % 10 == n3 % 10) {
            return true;
        }
        return false;
    }

    public static boolean isValid (int number) {

        if (number < 10 || number > 1000) {
            return false;
        }

        return true;
    }
}