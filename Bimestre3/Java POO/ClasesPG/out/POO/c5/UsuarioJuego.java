package c5;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private int puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje=0;
        this.nivel=0;
    }

    public void aumentarPuntaje(){
       this.puntaje++;
    }

    public void subirNivel(){
        this.nivel++;
    }

    public void bonus(Integer valor){
        this.puntaje+=valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }
}
