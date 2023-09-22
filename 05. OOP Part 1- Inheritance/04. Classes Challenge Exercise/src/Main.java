public class Main {

    public static void main(String[] args) {

        BankAccount fritzAccount = new BankAccount();

        fritzAccount.setAccountNumber("123456789");
        fritzAccount.setBalance(500);
        fritzAccount.setCustomerName("Ianculescu Florian");
        fritzAccount.setCustomerEmail("florian.ianculescu@gmail.com");
        fritzAccount.setCustomerPhoneNumber("0725772221");

        System.out.println("Account Number is - " + fritzAccount.getAccountNumber());
        System.out.println("Balance is - " + fritzAccount.getBalance());
        System.out.println("Customer name is - " + fritzAccount.getCustomerName());
        System.out.println("Customer Email is - " + fritzAccount.getCustomerEmail());
        System.out.println("Customer Phone Number is - " + fritzAccount.getCustomerPhoneNumber());
        System.out.println();

        fritzAccount.depositFunds(-500);
        System.out.println();

        fritzAccount.depositFunds(500);
        System.out.println();

        fritzAccount.withdrawlFunds(1500);
        System.out.println();

        fritzAccount.withdrawlFunds(600.55);
        System.out.println();
    }
}