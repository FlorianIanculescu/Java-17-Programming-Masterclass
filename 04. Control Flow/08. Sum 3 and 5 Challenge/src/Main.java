public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " is divisible by 3 and 5.");
                count++;
                sum += i;
            }
            if (count >= 5) {
                break;
            }
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}