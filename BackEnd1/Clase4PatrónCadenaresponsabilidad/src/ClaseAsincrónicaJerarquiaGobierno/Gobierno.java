package ClaseAsincrónicaJerarquiaGobierno;

public class Gobierno {

    private Jerarca jerarcaInicial;

    public Gobierno() {
        Jerarca presidente = new Presidente();
        Jerarca ministro = new Ministro(presidente);
        jerarcaInicial = new Diputado(ministro);
    }

    public void leer(Documento documento) {
        jerarcaInicial.leer(documento);
    }
}
