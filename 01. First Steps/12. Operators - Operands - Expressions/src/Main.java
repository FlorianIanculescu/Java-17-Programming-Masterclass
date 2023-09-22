public class Main {
    public static void main(String[] args) {

        int result = 1 + 2;     // 1 + 2 = 3
        System.out.println("result = " + result);

        System.out.println();

        int previousResult = result;
        result = result - 1;
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);

        System.out.println();

        char firstChar= 'A';
        char secondChar = 'B';
        System.out.println("firstChar = " + firstChar);
        System.out.println("SecondChar = " + secondChar);

        System.out.println(firstChar + secondChar);
        System.out.println("" + firstChar + secondChar);

        System.out.println();

        result = 2;
        result = result * 10;       // 2 * 10 = 20
        System.out.println("result = " + result);

        result = result / 4;        // 20 / 4 = 5
        System.out.println("result = " + result);
    }
}