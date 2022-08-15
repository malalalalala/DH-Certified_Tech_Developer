package ClaseSincrónicaCirculo;

public class Circulo {
    private String color;
    private double radio;
    private String tamaño;

    //color es el atributo compartido
    public Circulo(String color) {
        this.color = color;
    }

    //hago los getters y los setters de lo que cambia
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void dibujar(){
        System.out.println("Dibujamos objeto color" +color);
    }
}
