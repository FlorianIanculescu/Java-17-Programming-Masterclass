public class Main {
    public static void main(String[] args) {

        int result = 1;
        result = result + 1;
        System.out.println("result = " + result);
        System.out.println();

        result = 1;
        result++;
        System.out.println("result = " + result);
        System.out.println();

        result = 1;
        result--;
        System.out.println("result = " + result);
        System.out.println();

        result = 1;
        result += 1;
        System.out.println("result = " + result);
        System.out.println();

        result = 1;
        result -= 1;
        System.out.println("result = " + result);
        System.out.println();

        result = 1;
        result += 5;
        System.out.println("result = " + result);
        System.out.println();

        result = 10;
        result -= 5.5;
        System.out.println("result = " + result);
        System.out.println();

        result = 10;
        result = (int) (result - 5.5);
        System.out.println("result = " + result);
        System.out.println();

        double result1 = 10;
        result1 -= 5.5;
        System.out.println("result = " + result1);
        System.out.println();

        result1 = 10;
        result1 *= 1.5;
        System.out.println("result = " + result1);
        System.out.println();

        result1 = 10;
        result1 /= 1.5;
        System.out.println("result = " + result1);
        System.out.println();
    }
}