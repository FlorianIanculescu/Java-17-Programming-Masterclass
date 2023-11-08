import java.util.*;

public class MapViewsMain {

    public static void main(String[] args) {

        String separatorLine = "-".repeat(50);
        System.out.println(separatorLine);

        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);

        System.out.println(separatorLine);

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        System.out.println(separatorLine);

        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, so of course I have info");
        }

        System.out.println(separatorLine);

        keysView.remove("Daffy Duck");
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println(separatorLine);

        copyOfKeys.remove("Linus Van Pelt");
        System.out.println(copyOfKeys);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println(separatorLine);

        keysView.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robin Hood", "Mickey Mouse"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println(separatorLine);
        keysView.clear();
        System.out.println(contacts);

//        keysView.add("Daffy Duck");
//        System.out.println(contacts);

        System.out.println(separatorLine);

        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        System.out.println(keysView);

        System.out.println(separatorLine);

        var values = contacts.values();
        values.forEach(System.out::println);

        System.out.println(separatorLine);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println(separatorLine);

        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));

        System.out.println(separatorLine);

        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        keysView.forEach(System.out::println);

        System.out.println(separatorLine);

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if (set.size() < contacts.keySet().size()) {
            System.out.println("\n-----> Duplicate Values are in my Map");
        }

        System.out.println(separatorLine);

        var nodeSet = contacts.entrySet();
        for (var node : nodeSet) {
            System.out.println(nodeSet.getClass().getName());
            if (!node.getKey().equals(node.getValue().getName())) {
                System.out.println(node.getClass().getName());
                System.out.println("Key doesn't match name: " + node.getKey() + ": " + node.getValue());
            }
        }

        System.out.println(separatorLine);
    }
}
