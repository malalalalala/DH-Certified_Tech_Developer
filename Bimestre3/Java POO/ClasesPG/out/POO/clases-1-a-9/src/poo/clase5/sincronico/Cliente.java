public class Cliente {

    private String numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    public void incrementarDeuda(Double valor) {
        this.deuda += valor;
    }

    public void pagarDeuda() {
        System.out.println("\tEl cliente número " + this.numeroCliente + ": " + this.nombre + " está pagando su deuda...");
        this.deuda = 0.0;
    }

    public void mostrarDeuda() {
        System.out.println("\n\tLa deuda del cliente " + this.nombre + " es : $" + this.deuda);
    }
}
