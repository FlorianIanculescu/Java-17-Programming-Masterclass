public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        printInformation("Hello World");
        System.out.println("---------------------------------------");

        printInformation("");
        System.out.println("---------------------------------------");

        printInformation("\t   \n");
        System.out.println("---------------------------------------");

        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        System.out.println("---------------------------------------");

        System.out.printf("Index of World = %d %n", helloWorld.indexOf("World"));
        System.out.println("---------------------------------------");
        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l'));
        System.out.println("---------------------------------------");

        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l'));
        System.out.println("---------------------------------------");
        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l'));
        System.out.println("---------------------------------------");
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l'));
        System.out.println("---------------------------------------");

        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.println("---------------------------------------");
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l', 8));
        System.out.println("---------------------------------------");

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        System.out.println("---------------------------------------");

        if(helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if(helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        System.out.println("---------------------------------------");

        if(helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        System.out.println("---------------------------------------");

        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
        System.out.println("---------------------------------------");
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}