package ClaseAsincrónicaConexiónInternet;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> sitiosBloqueados = Arrays.asList("www.youtube.com","www.facebook.com");
        IConexionInternet proxy = new ProxyInternet(sitiosBloqueados,new InternetService());

        proxy.conectarCon("www.google.com");
        proxy.conectarCon("www.youtube.com");
    }
}
