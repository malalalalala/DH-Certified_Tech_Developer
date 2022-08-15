package ClaseSincrónicaRodoMensajeriaColmena;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarEmail(Mail mail) {
        System.out.println("El correo está pasando por spam");
        System.out.println("Termina la cadena, es un correo spam");
    return "Mandando a spam";
    }
}
