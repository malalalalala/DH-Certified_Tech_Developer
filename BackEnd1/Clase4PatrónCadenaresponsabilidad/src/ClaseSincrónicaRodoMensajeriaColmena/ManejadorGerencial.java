package ClaseSincrónicaRodoMensajeriaColmena;

public class ManejadorGerencial extends Manejador{

    @Override
    public String comprobarEmail(Mail mail) {
        System.out.println("El correo está pasando por Gerencial");
        if(mail.getDestino().equals("gerencial@colmena.com")||mail.getTema().equals("Tecnica")){
            System.out.println("Me corresponde por ser Gerencial");
            return "Enviado a gerencial";
        }else{
            return this.getSiguienteManejador().comprobarEmail(mail);
        }

    }
}
