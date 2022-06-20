package MesaTrabajoControlCalidad;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad sigAnalistaDeCalidad;

    public abstract void verificarCalidad(Articulo articulo);

    public AnalistaDeCalidad getSigAnalistaDeCalidad() {
        return sigAnalistaDeCalidad;
    }

    public void setSigAnalistaDeCalidad(AnalistaDeCalidad sigAnalistaDeCalidad) {
        this.sigAnalistaDeCalidad = sigAnalistaDeCalidad;
    }
}

