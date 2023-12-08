import consumer.specific.ChildClass;
import external.util.Logger;
import generic.BaseClass;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        printSeparators();
        parent.recommendedMethod();

        printSeparators();
        childReferredToAsBase.recommendedMethod();

        printSeparators();
        child.recommendedMethod();

        printSeparators();
        parent.recommendedStatic();

        printSeparators();
        childReferredToAsBase.recommendedStatic();

        printSeparators();
        child.recommendedStatic();

        printSeparators();
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        printSeparators();
        String xArgument = "This is all I've got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After Method, xArgument: " + xArgument);
        System.out.println("After Method, zArgument: " + zArgument);

        printSeparators();
        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz.");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);
    }

    private static void printSeparators() {
        System.out.println("-".repeat(50));
    }

    private static void doXYZ(String x, int y, final StringBuilder z) {

        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
//        z = new StringBuilder("This is a new reference");
    }
}