public class BankAccount {

    private String firstNAme;
    private String lastName;
    private double balance;
    private int accountType;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;



    public BankAccount(String firstNAme, String lastName, double balance, int typeOfAccount) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller
    // It's a false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {

        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller
    // It's a false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {

        if ((amount > 500.00) && !branch) {
            throw new IllegalArgumentException();
        }

        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    // More methods that use firstName, lastName and perform other functions.
}
