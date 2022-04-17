public abstract class Habilidad {
    private String nombre;
    private String descripcion;

    public Habilidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPuntaje();

    public String getNombre() {
        return nombre;
    }
}
