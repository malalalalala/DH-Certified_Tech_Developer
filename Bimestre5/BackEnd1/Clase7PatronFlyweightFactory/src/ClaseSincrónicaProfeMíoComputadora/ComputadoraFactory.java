package ClaseSincrónicaProfeMíoComputadora;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private Map<String,Computadora> computadoraMap=new HashMap<>();

    public Computadora crearComputadora(int ram, int disco){
        //       Establesco la clave
        String clave="key"+ram+"-"+disco;

        //Busco la computadora en el Map, según la clave

        Computadora computadora=computadoraMap.get(clave);
        if(computadora==null){
            //crear una nueva instancia
            computadora=new Computadora(ram,disco);
            //agregarlo al Map
            computadoraMap.put(clave,computadora);
            System.out.println("creé una nueva computadora: "+computadora);

        }
        return computadora;

    }

}
