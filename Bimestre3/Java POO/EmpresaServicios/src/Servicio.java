public abstract class Servicio {
    private String nombre;
   private String  descripcion;

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
