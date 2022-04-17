package classes;

import exceptions.ClientesException;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private double saldoEnCuenta;
    private double limite;

    public Cliente(String nombre, String apellido, String dni, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
    }

    public void comprar(double importe) throws ClientesException {
        if(importe > this.limite) {
            throw new ClientesException("ERROR: El importe supera el limite disponible de " + this.limite);
        }
        this.saldoEnCuenta -= importe;
    }

    public void saldarDeuda(double importe) throws ClientesException {
        if(this.saldoEnCuenta >= 0) {
            throw new ClientesException("ERROR: no existe ninguna deuda para el cliente con DNI: " + this.dni);
        }
        this.saldoEnCuenta += importe;
    }
}
