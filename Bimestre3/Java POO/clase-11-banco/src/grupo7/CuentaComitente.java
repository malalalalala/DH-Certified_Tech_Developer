package grupo7;

public class CuentaComitente extends Cuenta {
    private String cnv;

    public CuentaComitente(double saldo, Cliente cliente, String cnv) {
        super(saldo, cliente);
        this.cnv = cnv;
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto * 0.99);
    }

    @Override
    public void extraer(double monto) {
        System.out.println("\nIntentando extraer: $" + monto);
        if (monto <= getSaldo() * 0.5) {
            setSaldo(getSaldo() - monto);
        }
    }

    public void extraer(double monto, String cnv) {
        System.out.println("\nIntentando extraer: $" + monto);
        if (this.cnv.equals(cnv) && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        }
    }
}
