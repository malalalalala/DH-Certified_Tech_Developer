import java.util.HashSet;
import java.util.Set;

public class Company {
    private String name;
    private Set<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new HashSet<>();
    }

    public void addEmployee(String name, String surname, String id, String code) throws Exception {
        Employee newEmployee = EmployeeFactory.create(name, surname, id, code);
        this.employees.add(newEmployee);
    }

    public double calculateTotalSalary(int days) {
        double totalSalary = 0.0;
        for (Employee employee: this.employees) {
            totalSalary += employee.calculateSalary(days);
        }
        return totalSalary;
    }
}
