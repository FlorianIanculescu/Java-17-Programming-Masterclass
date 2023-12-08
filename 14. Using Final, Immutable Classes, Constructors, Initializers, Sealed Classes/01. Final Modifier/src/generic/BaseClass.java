package generic;

public class BaseClass {

    public final void recommendedMethod() {
        System.out.println("[BaseClass.recommendedMethod]: Best Way to Do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod]: Customize Optional Method");
    }

    private final void mandatoryMethod() {
        System.out.println("[BaseClass.mandatoryMethod]: NON_NEGOTIABLE!");
    }

    public static void recommendedStatic() {
        System.out.println("[BaseClass.recommendedStatic]: Best Way to Do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic() {
        System.out.println("[BaseClass.optionalStatic]: Customize Optional Method");
    }

    private static void mandatoryStatic() {
        System.out.println("[BaseClass.mandatoryStatic]: NON_NEGOTIABLE!");
    }
}
