public class SocioHabilitado extends Socio {

    private double ingresoPileta;
    private boolean habilitado;

    public SocioHabilitado(String numeroSocio, String nombre, double cuotaMensual, String actividad, double ingresoPileta) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.ingresoPileta = ingresoPileta;
        this.habilitado = false;
    }

    public double getIngresoPileta() {
        return ingresoPileta;
    }

    public void setIngresoPileta(double ingresoPileta) {
        this.ingresoPileta = ingresoPileta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public double cuotaMensual() {
        double cuota = super.cuotaMensual();
        if (this.habilitado) {
            cuota += this.ingresoPileta;
        }
        return cuota;
    }

    public boolean estaHabilitado() {
        return this.habilitado;
    }
}
