package ClaseSincrónicaCirculo;

import java.util.HashMap;

public class FlyweightFactory {

    //lo que es static y final es la referencia
    //nuestra key (string) va a ser el color
    private static final HashMap<String,Circulo> circuloMap= new HashMap<>();
    //esto es lo que va a ir por detrás, lo que va a hacer es manejar la fábrica

    public static Circulo obtenerCirculo(String color){
        Circulo circulo=circuloMap.get(color);
        if(circulo==null){
            circulo=new Circulo(color);
            circuloMap.put(color,circulo);
            System.out.println("creo un círculo de color" +color);
        }
        return circulo;
    }

}
