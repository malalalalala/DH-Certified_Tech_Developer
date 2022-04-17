package c7;

public class Carro {
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        motor=new Motor();
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
