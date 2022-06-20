package ClaseSincrónicaProfeRodoComputadora;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String,Computadora> computadorasLigeras=new HashMap<>();

    public Computadora getComputadora(int ram,int disco){
        //como usamos map tenemos que agregar clave y valores
        //la clave tiene que ser un string relevante
        //clave mix entre ram y dico, cada computadora es distinta de acuerdo a estas dos cosas
        String clave="key"+ram+"-"+disco;
        System.out.println("clave creada" +clave);
        //verificamos si está en el Map
        //si existe devolvemos el objeto sino crearlo
        if (!computadorasLigeras.containsKey(clave)){
            //creao la compu
            computadorasLigeras.put(clave,new Computadora(ram,disco));
            System.out.println("Computadora creada y agregada a la lista");
        }else {
            //la clave existe, retornamos el objeto ya existente
            System.out.println("computadora recuperada, no fue creada");
        }
        return computadorasLigeras.get(clave);
    }
}
