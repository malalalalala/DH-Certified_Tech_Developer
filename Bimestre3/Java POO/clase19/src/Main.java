public class Main {
    public static void main(String[] args) {
        Company coca = new Company("Coca-Cola");
        try {
            coca.addEmployee("Carla", "Antonini", "45620", "EMP-INT");
            coca.addEmployee("Eugenia", "Guatelli", "dqw31254", "EMP-EXT");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
