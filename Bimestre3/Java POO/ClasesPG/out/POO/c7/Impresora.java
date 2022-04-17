package c7;
public class Impresora {
    private String modelo;
    private String fechaFabricacion;
    private String tipoConexion;
    private int cantidadHojas;

    public Impresora(String modelo, String fechaFabricacion, String tipoConexion) {
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        setTipoConexion(tipoConexion);
        this.cantidadHojas = 0;
    }

    private void setTipoConexion(String tipoConexion) {
        if (tipoConexion.equals("USB") || tipoConexion.equals("inalambrica")) {
            this.tipoConexion = tipoConexion;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean tienePapel() {
        return this.cantidadHojas > 0;
    }

    public void setCantidadHojas(int cantidadHojas) {
        if (cantidadHojas > 0) {
            this.cantidadHojas += cantidadHojas;
        } else {
            System.out.println("No podemos restar hojas.");
        }
    }

    public void imprimir(String texto) {
        if (this.tienePapel()) {
            System.out.println(texto);
            this.cantidadHojas--;
        } else {
            System.out.println("No hay papel");
        }
    }
}