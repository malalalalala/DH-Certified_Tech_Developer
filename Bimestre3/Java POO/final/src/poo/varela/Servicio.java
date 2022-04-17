package poo.varela;

public abstract class Servicio {

    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();
    public abstract String toString();
}
