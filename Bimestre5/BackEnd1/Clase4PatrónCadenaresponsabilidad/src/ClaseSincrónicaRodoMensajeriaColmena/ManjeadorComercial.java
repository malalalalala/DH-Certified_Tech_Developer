package ClaseSincrónicaRodoMensajeriaColmena;

public class ManjeadorComercial extends Manejador{
    @Override
    public String comprobarEmail(Mail mail) {
        System.out.println("El correo está pasando por Comercial");
        if(mail.getDestino().equals("comercial@colmena.com")||mail.getTema().equals("Comercial")){
            System.out.println("Me corresponde por ser comercial");
            return "Enviado a comercial";
        }else{
            return this.getSiguienteManejador().comprobarEmail(mail);
        }

    }
}
