package ClaseSincronicaRodolfoLiquidacionSueldos;

public class Hired extends Employee{
private int cantidadHoras;
private double valorHora;

    public Hired(String nombre, String apellido, String numeroDeCuenta, int cantidadHoras, double valorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
