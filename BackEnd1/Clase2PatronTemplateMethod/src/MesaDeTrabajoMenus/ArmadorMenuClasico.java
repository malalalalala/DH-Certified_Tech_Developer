package MesaDeTrabajoMenus;

public class ArmadorMenuClasico extends ArmadorDeMenu{
    @Override
    protected String armar(Menu menu) {
        String mensaje = "debe Ser un menu clasico";

        if(menu instanceof MenuClasico){
                    mensaje = "1-Agregar comida.\n2-Cocinar comida\n";
                }
        return mensaje;
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }
}
