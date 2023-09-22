public class Main {

    public static void main(String[] args) {

//        System.out.println(getLargestPrime (21));
//        System.out.println(getLargestPrime (217));
//        System.out.println(getLargestPrime (0));
//        System.out.println(getLargestPrime (45));
//        System.out.println(getLargestPrime (-1));
        System.out.println(getLargestPrime (16));
    }

    public static int getLargestPrime(int number) {

        for(int i = number; i > 1; i--) {
            if (number % i == 0) {
                int count = 0;
                for(int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}