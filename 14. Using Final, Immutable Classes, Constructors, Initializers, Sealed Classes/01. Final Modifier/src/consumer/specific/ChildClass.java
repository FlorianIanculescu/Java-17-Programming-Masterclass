package consumer.specific;

import generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[ChildClass.optionalMethod]: Extra Stuff Here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//
//        System.out.println("[ChildClass.recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    private void mandatoryMethod() {

        System.out.println("[ChildClass.mandatoryMethod]: My own important stuff");
    }

    public static void recommendedStatic() {
        System.out.println("[ChildClass.recommendedStatic]: Best Way to Do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
