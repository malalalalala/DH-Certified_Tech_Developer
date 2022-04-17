package c6;

import org.jetbrains.annotations.NotNull;

public class Impresora {
    private String modelo;
    private String fechaFabricacion;
    private int cantidadHojas;
    private String tipoConexion;

    public Impresora(String modelo, String fechaFabricacion, String tipoConexion) {
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.tipoConexion = tipoConexion;
        this.cantidadHojas=0;

    }

    private boolean tienePapel(){
        return this.cantidadHojas>0;
    }

    private void setTipoConexion(@NotNull String tipoConexion) {
        if (tipoConexion.equals("USB") || tipoConexion.equals("inalambrica")) {
            this.tipoConexion = tipoConexion;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setCantidadHojas(int cantidadHojas) {
        if (cantidadHojas > 0) {
            this.cantidadHojas += cantidadHojas;
            System.out.println("Cantidad de hojas " + this.cantidadHojas);
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
