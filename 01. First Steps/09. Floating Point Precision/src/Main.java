public class Main {
    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;

        System.out.println();
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);
        System.out.println();

        myIntValue = 5 / 2;
        System.out.println("My Int Value = " + myIntValue);

        myFloatValue = 5f / 2f;
        System.out.println("My Float Value = " + myFloatValue);

        myDoubleValue = 5d / 2d;
        System.out.println("My Double Value = " + myDoubleValue);

        System.out.println();

        myIntValue = 5 / 3;
        System.out.println("My Int Value = " + myIntValue);

        myFloatValue = 5f / 3f;
        System.out.println("My Float Value = " + myFloatValue);

        myDoubleValue = 5d / 3d;
        System.out.println("My Double Value = " + myDoubleValue);

        System.out.println();

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted  kilograms = " + convertedKilograms);

        System.out.println();

        double pi = 3.1415927d;
        System.out.println("PI = " + pi);

        double anotherNumber = 3_000_000.3_456_890d;
        System.out.println("Another Number = " + anotherNumber);
    }
}