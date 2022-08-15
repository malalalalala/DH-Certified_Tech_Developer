package MesaDeTrabajoMenusRodo;

public class CocineroMenuClasico extends CocineroDeMenu{

    @Override
    protected String armar(Menu menu) {
        return "1-Preparar ingredientes\n2-Cocinar ingredientes.\n";
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }
}
