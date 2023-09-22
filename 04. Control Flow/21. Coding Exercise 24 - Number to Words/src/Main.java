public class Main {

    public static void main(String[] args) {

        numberToWords(123);

        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int storedNumber = number;
        number = reverse(number);

        int printCount = 0;
        while (number != 0) {

            switch (number % 10) {
                case 0 :
                    System.out.print("Zero ");
                    break;
                case 1 :
                    System.out.print("One ");
                    break;
                case 2 :
                    System.out.print("Two ");
                    break;
                case 3 :
                    System.out.print("Three ");
                    break;
                case 4 :
                    System.out.print("Four ");
                    break;
                case 5 :
                    System.out.print("Five ");
                    break;
                case 6 :
                    System.out.print("Six ");
                    break;
                case 7 :
                    System.out.print("Seven ");
                    break;
                case 8 :
                    System.out.print("Eight ");
                    break;
                case 9 :
                    System.out.print("Nine ");
                    break;
            }
            number /= 10;
            printCount++;
        }
        while (printCount < getDigitCount(storedNumber)) {
            System.out.print("Zero ");
            printCount++;
        }
        System.out.println();
    }

    public static int reverse (int number) {

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int digitCount = 0;

        do {
            digitCount++;
            number /= 10;
        } while (number != 0);

        return digitCount;
    }
}