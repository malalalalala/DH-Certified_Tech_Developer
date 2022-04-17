import java.util.Date;

public class Empleado {
    private String nombre;
    private Date fechaIncorporacion;

    public int calcularAntiguedad(){
        Date fechaActual=new Date();
        return fechaActual.getYear()-fechaIncorporacion.getYear();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }
}
