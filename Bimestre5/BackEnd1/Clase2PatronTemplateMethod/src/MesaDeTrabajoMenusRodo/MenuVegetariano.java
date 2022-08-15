package MesaDeTrabajoMenusRodo;

public class MenuVegetariano extends Menu{
    private int cantidadSalsas;

    public MenuVegetariano(double precioBase, int cantidadSalsas) {
        super(precioBase);
        this.cantidadSalsas = cantidadSalsas;
    }

    public int getCantidadSalsas() {
        return cantidadSalsas;
    }

    public void setCantidadSalsas(int cantidadSalsas) {
        this.cantidadSalsas = cantidadSalsas;
    }
}
