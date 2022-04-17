import java.util.ArrayList;
import java.util.List;

public class Barco {

    private List<Carga> cargas;

    public Barco() {
        this.cargas=new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        this.cargas.add(carga);
    }

    public void mostrarCargasInfo(){
        for (Carga carga:this.cargas) {
            System.out.println(carga);
        }

    }

}
