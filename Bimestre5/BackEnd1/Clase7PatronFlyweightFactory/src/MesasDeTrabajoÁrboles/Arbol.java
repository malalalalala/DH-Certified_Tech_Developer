package MesasDeTrabajoÁrboles;

public class Arbol {
    private String tipo;
    private int alto;
    private int ancho;
    private String color;
    //para cuando yo tenga un valor, cada vez que cree me va a decir cuántos voy creandop
    private static int contador;

    public Arbol(String tipo) {
        this.tipo = tipo;
        contador++;
      }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arbol.contador = contador;
    }

    //    public Arbol(String tipo, int alto, int ancho, String color) {
//        this.tipo = tipo;
//        this.alto = alto;
//        this.ancho = ancho;
//        this.color = color;
//        contador++;
//    }


    @Override
    public String toString() {
        return "Arbol{" +
                "tipo='" + tipo + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                '}';
    }
}
