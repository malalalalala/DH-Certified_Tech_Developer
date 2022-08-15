package MesaDeTrabajoMenusRodo;

public class CocineroMenuVegetariano extends CocineroDeMenu{
    @Override
    protected String armar(Menu menu) {
        return "1-Preparar ingredientes\n2-Cocinar ingredientes.\n3-Agregar especias.\n4-Agregar salsas.";
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        double resp=0;
        if(menu instanceof MenuVegetariano){
            double recargoXespecias=menu.getPrecioBase()*0.01;
            resp=menu.getPrecioBase()+((MenuVegetariano)menu).getCantidadSalsas()*2+ recargoXespecias;
        }
        return resp;
    }
}
