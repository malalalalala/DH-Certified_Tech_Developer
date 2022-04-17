package c7;

public class Chofer {
    private String nombre;
    private String apellido;
    private Carro carro;

    public Chofer(String nombre, String apellido, Carro carro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carro = carro;
    }

    public String verPatente(){
        return carro.getPatente();
    }

    public String getNombre() {
        return nombre;
    }
}
