import java.io.Serializable;

public class Perro implements Serializable {
    private String nombre;
    private String raza;
    private int id;
    private String direccion;


    public String getNombre() {
        return nombre;
    }

    public Perro(String nombre, String raza, int id, String direccion) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", id=" + id +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
