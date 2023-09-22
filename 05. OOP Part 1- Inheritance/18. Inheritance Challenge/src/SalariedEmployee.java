public class SalariedEmployee extends Employee {

    double anualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double anualSalary) {
        super(name, birthDate, hireDate);
        this.anualSalary = anualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = anualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }

    public void retired() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
