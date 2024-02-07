import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Person(String firstName, String lastName, int age) {

    private final static String[] firsts = {"Able", "Bob", "Charlie" ,"Donna", "Eve", "Fred"};
    private final static String[] lasts = {"Norton", "OHara", "Petersen" ,"Quincy", "Richardson", "Smith"};
    private final static Random random = new Random();

    public Person() {
        this(firsts[random.nextInt(firsts.length)],
                lasts[random.nextInt(lasts.length)],
                random.nextInt(18, 100));
    }

    @Override
    public String toString() {
        return "%s, %s (%d)".formatted(lastName, firstName, age);
    }
}
public class Main {

    public static void main(String[] args) {

        var persons = Stream.generate(Person::new)
                .limit(10)
                .sorted(Comparator.comparing(Person::lastName))
                .toArray();

        for (var person : persons) {
            System.out.println(person);
        }

        System.out.println("------------------------------");

        Arrays.stream(persons)
                .limit(10)
                .parallel()
//                .sorted(Comparator.comparing(Person::lastName))
                .forEach(System.out::println);

        System.out.println("------------------------------");

        int sum = IntStream.range(1, 101)
                .parallel()
                .reduce(0, Integer::sum);
        System.out.println("The sum of the numbers is = " + sum);

        String humptyDumpty = """
                Humpty Dumpty sat on a wall.
                Humpty Dumpty had a great fall.
                All the king's horses and all the king's men
                Couldn't put Humpty together again.""";

        System.out.println("------------------------------");

        var words = new Scanner(humptyDumpty).tokens().toList();
        words.forEach(System.out::println);

        System.out.println("------------------------------");

        var backTogetherAgain = words
//                .stream()
                .parallelStream()
//                .reduce(
//                        new StringJoiner(" "),
//                        StringJoiner::add,
//                        StringJoiner::merge
//                );
//
                .collect(Collectors.joining(" "));
//        .reduce("", (s1, s2) -> s1.concat(s2).concat(" "));

        System.out.println(backTogetherAgain);

        System.out.println("------------------------------");

        Map<String, Long> lastNameCounts = Stream.generate(Person::new)
                .limit(10_000)
                .parallel()
                .collect(Collectors.groupingByConcurrent(
                        Person::lastName,
                        Collectors.counting()
                ));

        lastNameCounts.entrySet().forEach(System.out::println);

        long total = 0;

        for (long count : lastNameCounts.values()) {
            total += count;
        }

        System.out.println("\nTotal = " + total);

        System.out.println(lastNameCounts.getClass().getName());

        var lastCounts = Collections.synchronizedMap(
                new ConcurrentSkipListMap<String, Long>());
        Stream.generate(Person::new)
                .limit(10_000)
                .parallel()
                .forEach((person) -> lastCounts.merge(person.lastName(), 1L, Long::sum));
        System.out.println(lastCounts);

        total = 0;

        for (long count : lastCounts.values()) {
            total += count;
        }

        System.out.println("\nTotal = " + total);

        System.out.println(lastCounts.getClass().getName());
    }
}