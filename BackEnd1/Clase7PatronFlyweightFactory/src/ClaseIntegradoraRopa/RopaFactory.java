package ClaseIntegradoraRopa;

import java.util.HashMap;
import java.util.Map;

public class RopaFactory {
    public static final Map<String, DiseñoRopa> ropaMap = new HashMap<>();

    public DiseñoRopa crearPrenda(String talle, String tipo, boolean esNuevo, boolean importada){

        String clave="key: "+talle+ "-"+tipo+"-"+esNuevo+"-"+importada;

        DiseñoRopa prenda=ropaMap.get(clave);
        if (prenda==null){
             prenda=new DiseñoRopa( talle,  tipo,  esNuevo,  importada);
            System.out.println("Se crea una nueva prenda" + prenda);
            ropaMap.put(clave,prenda);
         }
        return prenda;
    }
}
