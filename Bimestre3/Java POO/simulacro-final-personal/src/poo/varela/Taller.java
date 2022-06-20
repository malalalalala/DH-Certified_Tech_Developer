package poo.varela;

public class Taller extends OfertaAcademica {

    private double precioPorTP;
    private int cantidadTPs;

    public Taller() {
        super("", "");
        precioPorTP = 0;
        cantidadTPs = 0;
    }

    public double getPrecioPorTP() {
        return precioPorTP;
    }

    public int getCantidadTPs() {
        return cantidadTPs;
    }

    public void setPrecioPorTP(double precioPorTP) {
        this.precioPorTP = precioPorTP;
    }

    public void setCantidadTPs(int cantidadTPs) {
        this.cantidadTPs = cantidadTPs;
    }

    @Override
    public double calcularPrecio() {
        return precioPorTP * cantidadTPs;
    }

    @Override
    public String toString() {
        return  "\nCurso: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tPrecio por TP: $ " + precioPorTP +
                "\n\tCantidad de TPs: " + cantidadTPs +
                "\n----Precio total:\t$ " + this.calcularPrecio();
    }
}
