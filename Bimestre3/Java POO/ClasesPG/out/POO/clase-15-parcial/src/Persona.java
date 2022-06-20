public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    public Persona(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\tNombre: " + this.nombre +
                "\n\tApellido: " + this.apellido +
                "\n\tDNI: " + this.dni +
                "\n\tEdad: " + this.edad;
    }
}