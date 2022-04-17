package EmpresaC10;

public class EmpleadoC10 {
    private String nombre;
    private String apellido;
    private String dni;

    public void trabajar(){
        System.out.println("Empleado " + nombre + " trabajando");
    }
    public void descansar(){
        System.out.println("Empleado " + nombre + " descansando");
    }
    @Override
    public String toString(){
        return "nombre: " + nombre +"\n" +
                "legajo: " + apellido +"\n" +
                "dni: " + dni +"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public EmpleadoC10(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
