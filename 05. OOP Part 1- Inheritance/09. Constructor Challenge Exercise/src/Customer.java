public class Customer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public Customer() {
        this("Nume 2", "Email 2");
        System.out.println("Constructor with no fields called.");
    }

    public Customer(String customerName, String customerEmail) {
        this(customerName, 30, customerEmail);
        System.out.println("Constructor with 2 fields called.");
    }

    public Customer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
        System.out.println("Constructor with 3 fields called.");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
