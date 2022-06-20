package model;

public class Odontologo {
    private Long id;
    private Integer nroMatricula;
    private String nombre;
    private String apellido;

    public Odontologo(Long id, Integer nroMatricula, String nombre, String apellido) {
        this.id = id;
        this.nroMatricula = nroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(Integer nroMatricula, String nombre, String apellido) {
        this.nroMatricula = nroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(Integer nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo con: " +
                "id=" + id +
                ", nroMatricula=" + nroMatricula +
                ", nombre='" + nombre + apellido;
    }
}
