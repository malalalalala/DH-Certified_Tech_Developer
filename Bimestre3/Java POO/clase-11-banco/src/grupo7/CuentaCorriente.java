package grupo7;

public class CuentaCorriente extends Cuenta {

    private double descubiertoPermitido;

    public CuentaCorriente(double saldo, Cliente cliente, double descubiertoPermitido) {
        super(saldo, cliente);
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(double monto) {
        System.out.println("\nIntentando extraer: $" + monto);
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("La operación se realizó con éxito");
        } else if (monto <= (this.descubiertoPermitido + getSaldo())) {
            this.descubiertoPermitido += getSaldo() - monto;
            setSaldo(getSaldo() - monto);
            System.out.println("El monto a extraer es mayor al saldo actual. Haciendo giro al descubierto...");
            System.out.println("\tEl descubierto que queda disponible es: $" + this.descubiertoPermitido);
        } else {
            System.out.println("El saldo de la cuenta es insuficiente, F");
        }
    }
}
