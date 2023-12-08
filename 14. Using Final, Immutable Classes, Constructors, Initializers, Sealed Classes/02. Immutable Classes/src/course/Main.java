package course;

public class Main {
    public static void main(String[] args) {

//        course.Person jane = new course.Person();
//        jane.setName("Jane");
//
//        course.Person jim = new course.Person();
//        jim.setName("Jim");
//
//        course.Person joe = new course.Person();
//        joe.setName("Joe");
//
//        course.Person john = new course.Person();
//        john.setName("John");
//        john.setDob("05/05/1900");
//        john.setKids(new course.Person[]{jane, jim, joe});
//
//        printSeparators();
//        System.out.println(john);
//
//        printSeparators();
//        john.setName("Jacob");
//        john.setKids(new course.Person[]{new course.Person(), new course.Person()});
//        System.out.println(john);

        printSeparators();

        Person jane = new Person("Jane", "01/01/1930");
        Person jim = new Person("Jim", "02/02/1932");
        Person joe = new Person("Joe", "03/03/1934");

        Person[] johnsKids = {jane, jim, joe};
        Person john = new Person("John", "01/01/1900", johnsKids);
        System.out.println(john);

        printSeparators();

        john.setKids(new Person[]{new Person("Ann", "04/04/1930")});
        System.out.println(john);

        printSeparators();

        Person[] kids = john.getKids();
        kids[0] = jim;
        System.out.println(john);

        printSeparators();

        kids = null;
        System.out.println(john);

        printSeparators();

        john.setKids(kids);
        System.out.println(john);

        printSeparators();
    }

    public static void printSeparators() {
        System.out.println("-".repeat(50));
    }
}