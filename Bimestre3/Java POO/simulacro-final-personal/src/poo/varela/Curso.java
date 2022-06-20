package poo.varela;

public class Curso extends OfertaAcademica {

    private double valorPorHora;
    private int duracionEnMeses;
    private int cargaHorariaMensual;

    public Curso() {
        super("", "");
        this.valorPorHora = 0;
        this.duracionEnMeses = 0;
        this.cargaHorariaMensual = 0;
    }

    public Curso(String nombre, String descripcion, double valorPorHora, int duracionEnMeses, int cargaHorariaMensual) {
        super(nombre, descripcion);
        this.valorPorHora = valorPorHora;
        this.duracionEnMeses = duracionEnMeses;
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public int getDuracionEnMeses() {
        return duracionEnMeses;
    }

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public void setDuracionEnMeses(int duracionEnMeses) {
        this.duracionEnMeses = duracionEnMeses;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    @Override
    public double calcularPrecio() {
        return valorPorHora * cargaHorariaMensual * duracionEnMeses;
    }

    @Override
    public String toString() {
        return  "\nCurso: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tPrecio por hora: $ " + valorPorHora +
                "\n\tDuracion (meses): " + duracionEnMeses +
                "\n\tCarga horaria (mensual): " + cargaHorariaMensual +
                "\n----Precio total:\t$ " + this.calcularPrecio();
    }
}
