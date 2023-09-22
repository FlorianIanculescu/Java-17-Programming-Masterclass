public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Nume 1", 10, "Email 1");
        System.out.println("Name - " + customer1.getName());
        System.out.println("Credit limit - " + customer1.getCreditLimit());
        System.out.println("Email Address - " + customer1.getEmailAdress());
        System.out.println();

        Customer customer2 = new Customer();
        System.out.println("Name - " + customer2.getName());
        System.out.println("Credit limit - " + customer2.getCreditLimit());
        System.out.println("Email Address - " + customer2.getEmailAdress());
        System.out.println();

        Customer customer3 = new Customer("Nume 3", "Email 3");
        System.out.println("Name - " + customer3.getName());
        System.out.println("Credit limit - " + customer3.getCreditLimit());
        System.out.println("Email Address - " + customer3.getEmailAdress());
    }
}