import com.example.mylibrary.Series;

public class Main {
    public static void main(String[] args) {

        System.out.print("nSum List = ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println();

        System.out.print("factorial List = ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println();

        System.out.print("fibonacci List = ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.fibonacci(i) + " ");
        }
    }
}