public class Main {
    public static void main(String[] args) {

        int myFirstnumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstnumber);

        int mySecondtnumber = 12;
        System.out.println(mySecondtnumber);

        int myThirdNumber = 6;
        System.out.println(myThirdNumber);

        int myTotal = myFirstnumber + mySecondtnumber + myThirdNumber;
        System.out.println(myTotal);

        myThirdNumber = myFirstnumber * 2;
        myTotal = myFirstnumber + mySecondtnumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}