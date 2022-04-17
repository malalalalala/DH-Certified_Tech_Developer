public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Double saldoEnCuenta;
    private Double limite;

    public Cliente(String nombre, String apellido, String DNI, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        this.saldoEnCuenta=0.0;
    }

    public void comprar(double importe) throws ClienteException {
        if(this.saldoEnCuenta+importe<=this.limite){
            this.saldoEnCuenta+=importe;
        }else {
            throw new ClienteException("superaste el límite de deuda"); //con esto se lanza,corta el flujo del programa y va subiendo hacia arriba hasta que alguien la atrape, quien use la clase cliente debe decir qué hacer con el error
        }

    }

    public void saldarDeuda(double importe) throws ClienteException {
        if(this.saldoEnCuenta-importe>=0){
            this.saldoEnCuenta-=importe;
        }else {
            throw new ClienteException("No puedes pagar más de lo que debes");
        }

    }



}
