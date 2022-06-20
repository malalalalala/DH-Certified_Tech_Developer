package grupo7;

public class Programa {
    public static void main(String[] args) {
        Cliente pepe = new Cliente(1, "Pepardo", 23000000, 230000006);
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(50000, pepe, 0.15);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(35000, pepe, 20000);
        CuentaComitente cuentaComitente = new CuentaComitente(30000, pepe, "holamanola");

        probar(pepe);
        probar(cajaDeAhorro);
        probar(cuentaCorriente);
        probar(cuentaComitente);
    }

    public static void probar(Cliente cliente) {
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("----------------------------- CLIENTE ---------------------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(cliente.toString());
        cliente.irAlBanco();
        cliente.quejarse();
        cliente.esperarEternamente();
    }

    public static void probar(CajaDeAhorro caja) {
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("------------------------- CAJA DE AHORRO ------------------------");
        System.out.println("-----------------------------------------------------------------");
        caja.informarSaldo();
        caja.cobrarInteres();
        caja.informarSaldo();
        caja.extraer(15000);
        caja.informarSaldo();
        caja.extraer(10000);
        caja.informarSaldo();
        caja.cobrarInteres();
        caja.informarSaldo();
        caja.depositar(2000);
        caja.informarSaldo();
        caja.extraer(40000);
        caja.informarSaldo();
    }

    public static void probar(CuentaCorriente cuenta) {
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("------------------------ CUENTA CORRIENTE -----------------------");
        System.out.println("-----------------------------------------------------------------");
        cuenta.informarSaldo();
        cuenta.depositar(5000);
        cuenta.informarSaldo();
        cuenta.extraer(10000);
        cuenta.informarSaldo();
        cuenta.extraer(30000);
        cuenta.informarSaldo();
        cuenta.extraer(25000);
        cuenta.informarSaldo();
        cuenta.extraer(20000);
        cuenta.informarSaldo();
    }

    public static void probar(CuentaComitente cuenta) {
        System.out.println("\n\n-----------------------------------------------------------------");
        System.out.println("------------------------ CUENTA COMITENTE -----------------------");
        System.out.println("-----------------------------------------------------------------");
        cuenta.informarSaldo();
        cuenta.depositar(10000);
        cuenta.informarSaldo();
        cuenta.extraer(10000);
        cuenta.informarSaldo();
        cuenta.extraer(20000);
        cuenta.informarSaldo();
        cuenta.extraer(20000, "hola");
        cuenta.informarSaldo();
        cuenta.extraer(20000, "holamanola");
        cuenta.informarSaldo();
    }
}
