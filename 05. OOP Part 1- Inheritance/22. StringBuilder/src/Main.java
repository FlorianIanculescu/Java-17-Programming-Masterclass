public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        System.out.println("----------------------------");
        printInformation(helloWorld);
        System.out.println("----------------------------");

        printInformation(helloWorldBuilder);
        System.out.println("----------------------------");

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);
        System.out.println("----------------------------");

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        System.out.println("----------------------------");

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        System.out.println("----------------------------");

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        System.out.println("----------------------------");
    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length() );
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length() );
        System.out.println("capacity = " + builder.capacity());
    }
}