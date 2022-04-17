public class Cuenta {
    private String numero;
    protected double saldo;
    public Cuenta(String numero,double saldo){
        this.numero=numero;
        this.saldo=saldo;
    }
    public void extraer(double importe){
        this.saldo = saldo - importe;
    }
}
