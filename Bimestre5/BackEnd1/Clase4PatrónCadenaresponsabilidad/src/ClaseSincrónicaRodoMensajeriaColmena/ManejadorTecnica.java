package ClaseSincrónicaRodoMensajeriaColmena;

public class ManejadorTecnica extends Manejador{
    @Override
    public String comprobarEmail(Mail mail) {
        System.out.println("El correo está pasando por Tecnica");
        if(mail.getDestino().equals("tecnica@colmena.com")||mail.getTema().equals("Tecnica")){
            System.out.println("Me corresponde por ser Técnica");
            return "Enviado a técnica";
        }else{
            return this.getSiguienteManejador().comprobarEmail(mail);
        }
    }
}
