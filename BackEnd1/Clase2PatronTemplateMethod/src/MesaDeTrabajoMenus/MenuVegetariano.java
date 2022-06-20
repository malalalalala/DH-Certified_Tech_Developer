package MesaDeTrabajoMenus;

public class MenuVegetariano extends Menu{
    private int cantidadDeSalsas;
    private boolean especias;

    public MenuVegetariano(double precioBase, int cantidadDeSalsas, boolean especias) {
        super(precioBase);
        this.cantidadDeSalsas = cantidadDeSalsas;
        this.especias =especias;
    }

    public boolean isEspecias() {
        return especias;
    }

    public void setEspecias(boolean especias) {
        this.especias = especias;
    }

    public int getCantidadDeSalsas() {
        return cantidadDeSalsas;
    }

    public void setCantidadDeSalsas(int cantidadDeSalsas) {
        this.cantidadDeSalsas = cantidadDeSalsas;
    }
}
