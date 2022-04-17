public class Socio {
    private String numeroSocio;
    private String nombre;
    private double cuotaMensual;
    private String actividad;

    public Socio(String numeroSocio, String nombre, double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public double cuotaMensual() {
        return this.cuotaMensual;
    }

    @Override
    public String toString() {
        return "\nNúmero de socio:\t" + this.numeroSocio + "\tNombre:\t" + this.nombre;
    }

    @Override
    public int hashCode() {
        final int primo = 37;
        return primo * this.nombre.hashCode() * this.numeroSocio.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales = false;
        if (!(obj == null || !(obj instanceof Socio)) && this.numeroSocio.equals(((Socio) obj).getNumeroSocio())) {
            sonIguales = true;
        }
        return sonIguales;
    }
}
