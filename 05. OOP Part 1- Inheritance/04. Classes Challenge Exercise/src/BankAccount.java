public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds (double deposit) {
        if (deposit < 0) {
            System.out.println("You have to enter a positive sum.");
        } else {
            this.balance += deposit;
            System.out.println("You added $" + deposit + ". New ballance is $" + this.balance);
        }
    }

    public void withdrawlFunds (double withdrawl) {

        if (withdrawl > this.balance) {
            System.out.println("You don't have enough funds! You only have $" + this.balance + " in your account.");
        } else {
            this.balance -= withdrawl;
            System.out.println("You withdrawl $" + withdrawl + " processed. New ballance is $" + this.balance);
        }
    }
}
