public class OnDependencyRelation extends Employee {
    private double monthlySalary;

    public OnDependencyRelation(String name, String surname, String id) {
        super(name, surname, id);
        this.monthlySalary = 1000;
    }

    @Override
    public double calculateSalary(int days) {
        return this.monthlySalary / 30 * days;
    }
}
