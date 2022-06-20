package grupo7;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void informarSaldo() {
        System.out.println("El saldo del cliente nro: " + this.cliente.getNroCliente() + " es: $" + String.format("%.2f", this.saldo));
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("\nDepositando: $" + monto + " al cliente nro: " + this.cliente.getNroCliente());
    }

    public abstract void extraer(double monto);
}