import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        try {
            Simple carga1=FactoryTiposDeCargas.crearCargaSimple("TV 32 LCD",3,"holi");

            Simple carga2=FactoryTiposDeCargas.crearCargaSimple("Medicamentos",2,"FST-456");

            List<Simple> cargasParaBarco1 =new ArrayList<>();

            cargasParaBarco1.add(carga1);
            cargasParaBarco1.add(carga2);

            Contenedor contenedor1=FactoryTiposDeCargas.crearContenedor("CHAO POO",100,cargasParaBarco1);

            Barco barquito1=new Barco();

            barquito1.agregarCarga(contenedor1);
            barquito1.agregarCarga(carga1);
            barquito1.agregarCarga(carga2);

            barquito1.mostrarCargasInfo();

        }catch (CodigoCargaSimpleExcepcion excepcion){
            System.out.println("Ingresaste un código inválido");
        }









    }
}
