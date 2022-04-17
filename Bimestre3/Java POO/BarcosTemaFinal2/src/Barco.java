import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> cargas;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.cargas=new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        this.cargas.add(carga);
    }

    public void mostrarInforme(){
        for (Carga carga:this.cargas) {
            System.out.println(carga);
        }

    }

}
