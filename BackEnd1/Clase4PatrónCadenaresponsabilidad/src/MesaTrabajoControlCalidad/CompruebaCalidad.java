package MesaTrabajoControlCalidad;

import ClaseSincrónicaRodoMensajeriaColmena.Mail;

public class CompruebaCalidad {
    private AnalistaDeCalidad inicial;

    public CompruebaCalidad(){
        inicial=new ControlLote();
        AnalistaDeCalidad peso= new ControlPeso();
        AnalistaDeCalidad envase= new ControlEnvase();

        inicial.setSigAnalistaDeCalidad(peso);
        peso.setSigAnalistaDeCalidad(envase);

    }

    public void iniciarComprobacion(Articulo articulo){
         inicial.verificarCalidad(articulo);
    }
}
