import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Carole", "David", "Ed" , "Fred", "Gary"};

        System.out.println("\n---------- 1. Transform to Uppercase ----------\n");

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        System.out.println("\n---------- 2. Add random middle initial ----------\n");

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println(Arrays.toString(names));

        System.out.println("\n---------- 3. Add reversed name as last name ----------\n");

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        Arrays.asList(names).forEach(s -> System.out.println(s));

        System.out.println("\n---------- 4. Remove names where first name = last name ----------\n");

        List<String> newList = new ArrayList<>(List.of(names));

        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));

        newList.forEach(s -> System.out.println(s));

//        System.out.println("\n---------- 5. Remove names where first name = last name (multi-line lambda ----------\n");
//
//        List<String> newList = new ArrayList<>(List.of(names));
//
//        newList.removeIf(s -> {
//            String first = s.substring(0, s.indexOf(" "));
//            String last = s.substring(s.lastIndexOf(" ") + 1);
//            return first.equals(last);
//        });
//
//        newList.forEach(s -> System.out.println(s));
    }

    public static char getRandomChar (char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }
}