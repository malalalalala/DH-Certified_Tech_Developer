import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private final static Logger logger= Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        List<Integer> listaEnteros=new ArrayList<>();

        int acumulador = 0;

        for (int i=0;i<=10;i++ ){
            int random= (int) (Math.random()*10);
            listaEnteros.add(random);
            acumulador+=random;
        }


        try {
            double promedio=acumulador/listaEnteros.size();
            logger.info("el promedio de la lista es" +promedio);
            if (listaEnteros.size()>5){
                logger.info("la lista tiene más de 5 elementos");
            }
            if (listaEnteros.size()>10){
                logger.info("la lista tiene más de 10 elementos");
            }
        }
        catch(Exception exception){
            logger.error("La lista no tiene elementos, no es posible la división por cero");
        }
    }
}

