package grupo7;

public class CajaDeAhorro extends Cuenta {

    private double tasaInteres;

    public CajaDeAhorro(double saldo, Cliente cliente, double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraer(double monto) {
        System.out.println("\nIntentando extraer: $" + monto);
        if (monto <= getSaldo()) {
            System.out.println("La operación se realizó con éxito");
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("El saldo de la cuenta es insuficiente, F");
        }
    }

    public void cobrarInteres() {
        setSaldo((1 + this.tasaInteres) * getSaldo());
        System.out.println("Cobrando interés: " + this.tasaInteres * 100 + "%");
    }
}
