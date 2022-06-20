import org.apache.log4j.Logger;

public class Main {

    private final static Logger logger= Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {

          try{
              logger.info("Comienza la operación de división");
                int resultado=4/0;

                logger.info("Finalizó la operación");}
          catch(Exception exception){
                     logger.error("Finalizó la divisón por cero");}

          }
}
