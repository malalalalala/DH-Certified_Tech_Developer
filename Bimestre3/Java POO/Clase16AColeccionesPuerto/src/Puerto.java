import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto() {
        this.contenedores=new ArrayList<>();
    }

    public void ingresarContenedores(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedor(){
        for (Contenedor contenedor:this.contenedores
             ) {
            System.out.println(contenedor);
        }

    }

    public int totalContenedoresPeligrosos(){
        int total=0;
        for (Contenedor contenedor:this.contenedores)
            {
                if(contenedor.getPais().equals("Desconocido")&&contenedor.getMaterialesPeligrosos()){
                total++;
            }
        }
        return total;
    }

}
