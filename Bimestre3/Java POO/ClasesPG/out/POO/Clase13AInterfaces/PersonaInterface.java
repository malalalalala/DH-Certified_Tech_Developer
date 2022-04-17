public class PersonaInterface implements Amigable{
    private String nombre;
    private Integer felicidad;
    private Integer cantidadAmigos;

    // constructor no borrar
    public PersonaInterface(String nombre) {
        this.nombre = nombre;
        felicidad = 100;
        cantidadAmigos = 0;
    }

    //implementa el metodo aca
    public void hacerAmigo(){
        this.cantidadAmigos ++;
        this.felicidad+=10;
    }


    //getters no borrar
    public Integer getFelicidad() {
        return felicidad;
    }

    public Integer getCantidadAmigos() {
        return cantidadAmigos;
    }

}
