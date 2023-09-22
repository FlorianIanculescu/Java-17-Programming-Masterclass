public class Main {

    public static void main(String[] args) {

        int i = 5;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (i <= 20) {
            if (isEvenNumber(i)) {
                evenNumbers++;
                System.out.println(i + " is an even number.");
            } else {
                oddNumbers++;
            }
            i++;
            if (evenNumbers == 5) {
                break;
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd nnumbers: " + oddNumbers);

    }

    public static boolean isEvenNumber(int number) {

        return (number % 2 == 0);
    }
}