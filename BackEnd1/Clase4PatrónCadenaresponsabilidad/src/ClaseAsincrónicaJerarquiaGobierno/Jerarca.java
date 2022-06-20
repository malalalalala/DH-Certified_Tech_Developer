package ClaseAsincrónicaJerarquiaGobierno;

public abstract class Jerarca {

    protected Jerarca siguienteJerarca;

    public Jerarca() {
        this.siguienteJerarca = null;
    }

    public Jerarca(Jerarca siguienteJerarca) {
        this.siguienteJerarca = siguienteJerarca;
    }

    public abstract void leer(Documento documento);
}
