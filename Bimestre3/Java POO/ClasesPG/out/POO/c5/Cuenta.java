package c5;

//Ya creamos la clase Cuenta que contiene un numero de cuenta y un saldo
//        Crear un método llamado depósito que tenga como parámetros de entrada cantidad de dinero. Al ser un
//        depósito la cantidad de dinero se incrementa al saldo.
//        Crear un método llamado extracción que tenga como parámetros de entrada cantidad de dinero. Al ser
//        una extracción, la cantidad se resta del saldo
//        Solo permitir realizar la extracción si el saldo es suficiente

public class Cuenta {

    private int numeroDeCuenta;
    private Double saldo;

    //crear la funcion depositar y retirar aca

    public void depositar(Double deposito){
        saldo+=deposito;
    }

    public void retirar(Double dinero){
        Double restante=saldo-dinero;
        if(restante>0){
            saldo-=dinero;
        }
        System.out.println("saldo insuficiente");

    }

    //no tocar estas funciones
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
