public class WithContract extends Employee {
    private double paymentByHour;
    private double tax;

    public WithContract(String name, String surname, String id) {
        super(name, surname, id);
        this.paymentByHour = 7;
        this.tax = 0.14;
    }

    @Override
    public double calculateSalary(int days) {
        final int HOURS_BY_DAY = 8;
        return HOURS_BY_DAY * this.paymentByHour * (1 - this.tax);
    }
}
