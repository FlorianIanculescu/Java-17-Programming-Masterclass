public class Main {

    public static void main(String[] args) {
        System.out.println("N = 1");
        printSquareStar(1);
        System.out.println("N = 2");
        printSquareStar(2);
        System.out.println("N = 3");
        printSquareStar(3);
        System.out.println("N = 4");
        printSquareStar(4);
        System.out.println("N = 5");
        printSquareStar(5);
        System.out.println("N = 6");
        printSquareStar(6);
        System.out.println("N = 7");
        printSquareStar(7);
        System.out.println("N = 8");
        printSquareStar(8);

    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number || i == j ||
                            (j == (number - i + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}