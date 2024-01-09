import java.util.List;

public class Main {
    public static void main(String[] args) {

        // MiniChallenge #1

        String sentence1 = "Hello, World!";
        boolean matches = sentence1.matches("Hello, World!");
        System.out.println(matches);

        // MiniChallenge #2

        String challenge2 = "[A-Z].*\\.";
//        String challenge2 = "[A-Z][a-z\\s]+[.]";

        for (String s : List.of(
                "This bike is red.",
                "I am a new student.",
                "hello World.",
                "How are you?"
        )) {
            boolean matched = s.matches(challenge2);
            System.out.println(matched + ": " + s);
        }

        // MiniChallenge #3

        String challenge3 = "[A-Z].+[.?!]";
//        String challenge3 = "^[A-Z][\\p{all}]+[.?!]$";

        for (String s : List.of(
                "This bike is red, and has flat tires.",
                "I love being a new L.P.A. student!",
                "Hello, friends and family: Welcome!",
                "How are you, Mary?"
        )) {
            boolean matched = s.matches(challenge3);
            System.out.println(matched + ": " + s);
        }
    }
}