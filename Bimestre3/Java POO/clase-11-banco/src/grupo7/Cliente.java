package grupo7;

public class Cliente {

    private int nroCliente;
    private String apellido;
    private int dni;
    private int cuit;

    public Cliente(int nroCliente, String apellido, int dni, int cuit) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void irAlBanco() {
        System.out.println("Yen2 al banco");
    }

    public void quejarse() {
        System.out.println("Odio ir al banco y hacer trámites todo este sistema está mal :'(");
    }

    public void esperarEternamente() {
        System.out.println("Esperanding");
    }

    @Override
    public String toString() {
        return "Nro:\t" + this.nroCliente + "\tApellido:\t" + this.apellido + "\tDNI:\t" + this.dni;
    }
}
