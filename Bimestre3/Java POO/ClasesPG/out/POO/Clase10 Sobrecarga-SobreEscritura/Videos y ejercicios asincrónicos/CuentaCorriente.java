public class CuentaCorriente extends Cuenta {
    private double descubierto;

    public CuentaCorriente(String numero,double saldo){
        super(numero,saldo);
        this.descubierto=1000;
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    @Override
    public void extraer(double importe){
        if((saldo+descubierto)>importe){
            this.saldo=saldo-importe;
        }
    }

    public void extraer(){
        if((saldo+descubierto)>1000){
            this.saldo=saldo-1000;
        }
    }
}
