public class Main {
    public static void main(String[] args) {

        System.out.println("Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
        System.out.println();

        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);
        System.out.println();

        float myOtherFloatValue = (float) 5.25;
        System.out.println("My Other Float Value = " + myOtherFloatValue);
    }
}