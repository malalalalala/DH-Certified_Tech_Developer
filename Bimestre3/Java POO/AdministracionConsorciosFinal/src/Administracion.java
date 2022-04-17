import java.util.HashSet;
import java.util.Set;

public class Administracion {
    private Set<UnidadFuncional> unidadesFuncionales;

    public Administracion() {
        this.unidadesFuncionales=new HashSet<>();
    }

       public void agregarUnidadFuncional(String codigo,String direccion, String duenio, double metrosCuadrados, double valorMetroCuadrado) throws CodigoUnidadFuncionalException {

        UnidadFuncional unidadFuncional=FactoryUnidadFuncional.crearUnidadFuncional(codigo,direccion,duenio,metrosCuadrados,valorMetroCuadrado);
        this.unidadesFuncionales.add(unidadFuncional);
    }

    public void mostrarUnidadesFuncionales(){
        for (UnidadFuncional unidadFuncional:this.unidadesFuncionales
             ) {
            System.out.println(unidadFuncional);
        }
    }
}
