public abstract class Employee {
    private String name;
    private String surname;
    private String id;

    public Employee(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    abstract public double calculateSalary(int days);
}
