import java.util.*;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {

        List<WeekDay> annsWorksDay = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY));

        printSeparators();

        var annsDaySet = EnumSet.copyOf(annsWorksDay);
        System.out.println(annsDaySet.getClass().getSimpleName());
        annsDaySet.forEach(System.out::println);
        printSeparators();

        var allDaySet = EnumSet.allOf(WeekDay.class);
        allDaySet.forEach(System.out::println);
        printSeparators();

        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaySet);
        newPersonDays.forEach(System.out::println);
        printSeparators();

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaySet);
        anotherWay.removeAll(annsDaySet);
        anotherWay.forEach(System.out::println);
        printSeparators();

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        businessDays.forEach(System.out::println);
        printSeparators();

        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);
        employeeMap.put(WeekDay.FRIDAY, new String[]{"Ann", "Mary", "Bob"});
        employeeMap.put(WeekDay.MONDAY, new String[]{"Ann", "Bob"});
        employeeMap.forEach((k, v) -> System.out.println(k + " : " + Arrays.toString(v)));
    }

    public static void printSeparators() {
        System.out.println("-".repeat(50));
    }
}