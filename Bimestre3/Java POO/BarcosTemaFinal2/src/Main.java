import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CargaSimple carga1=FactoryTiposDeCargas.crearCargaSimple("TV LED","TV",3.0,false);

        CargaSimple carga2=FactoryTiposDeCargas.crearCargaSimple("Medicamentos","medicamentos",2.0,true);

        List<CargaSimple> cargasParaEvergreen =new ArrayList<>();
        cargasParaEvergreen.add(carga1);
        cargasParaEvergreen.add(carga2);

        Contenedor contenedor1=FactoryTiposDeCargas.crearContenedor("Evergreen","contenedore empresa evergreen",100.0,cargasParaEvergreen);

      Barco barco1=new Barco("POO");

        barco1.agregarCarga(contenedor1);
        barco1.agregarCarga(carga1);
        barco1.agregarCarga(carga2);

        barco1.mostrarInforme();


    }
}
