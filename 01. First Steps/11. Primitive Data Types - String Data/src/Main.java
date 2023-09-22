public class Main {
    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);

        System.out.println();

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);

        System.out.println();

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println("numberString = " + numberString);
        System.out.println();

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to: " + lastString);
    }
}