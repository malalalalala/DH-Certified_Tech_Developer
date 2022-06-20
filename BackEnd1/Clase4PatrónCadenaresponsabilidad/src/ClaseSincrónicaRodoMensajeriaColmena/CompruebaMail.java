package ClaseSincrónicaRodoMensajeriaColmena;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail() {
        inicial = new ManejadorGerencial();
        Manejador comercial= new ManjeadorComercial();
        Manejador tecnico= new ManejadorTecnica();
        Manejador spam=new ManejadorSpam();

        inicial.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(spam);
    }

    public String iniciarComprobacion(Mail mail){
        return inicial.comprobarEmail(mail);
    }
}
