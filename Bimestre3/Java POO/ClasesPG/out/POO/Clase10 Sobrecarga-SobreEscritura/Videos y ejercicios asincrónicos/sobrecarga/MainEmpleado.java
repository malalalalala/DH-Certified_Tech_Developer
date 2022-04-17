public class MainEmpleado {
    public static void main(String[] args) {
        Empleado miEmpleado= new Empleado("Laura", "123");
        System.out.println("sueldo a cobrar " +miEmpleado.calcularSueldo());
        System.out.println("sueldo a cobrar con premio " +miEmpleado.calcularSueldo(5000));
    }
}
