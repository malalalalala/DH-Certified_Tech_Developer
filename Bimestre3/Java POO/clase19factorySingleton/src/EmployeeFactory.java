public class EmployeeFactory {
    public static Employee create(String name, String surname, String id, String code) throws Exception {
        return switch (code) {
            case "EMP-INT" -> new OnDependencyRelation(name, surname, id);
            case "EMP-EXT" -> new WithContract(name, surname, id);
            default -> throw new Exception();
        };
    }
}
