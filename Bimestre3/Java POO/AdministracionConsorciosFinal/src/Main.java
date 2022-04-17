import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try{
            UnidadFuncional cochera1=FactoryUnidadFuncional.crearUnidadFuncional("COCH","bla","bla",10,10);

            UnidadFuncional depto1=FactoryUnidadFuncional.crearUnidadFuncional("DEPTO","bla","blE",10,10);

            UnidadFuncional local1=FactoryUnidadFuncional.crearUnidadFuncional("LOCAL","bla","blI",10,10);

            UnidadFuncional local2=FactoryUnidadFuncional.crearUnidadFuncional("LOCAL","bla","blO",20,10);

            Shopping shopping1= (Shopping) FactoryUnidadFuncional.crearUnidadFuncional("SHOP","BLA","HOLI",30,10);

            shopping1.agregarLocales((Local) local1);
            shopping1.agregarLocales((Local) local2);

            Administracion administracion1= new Administracion();
        administracion1.agregarUnidadFuncional();
        }
        catch (CodigoUnidadFuncionalException exception) {
            System.out.println(exception.getMessage());

        }



    }
}
