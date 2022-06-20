package MesaDeTrabajoMenus;

public class ArmadorMenuVegetariano extends ArmadorDeMenu{
    @Override
    protected String armar(Menu menu) {
        String mensaje = "Debe ingresar un menú vegano";
                if(menu instanceof MenuVegetariano){
                    mensaje = "1-Agregar especias\n2-Agregar salsas\n3-Agregar comida";
                }
        return mensaje;
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        double resp=0;
        double precioEspecias = ((MenuVegetariano)menu).isEspecias()? 0.01:0.0;
        if (menu instanceof MenuVegetariano){
            double recargos=(menu.getPrecioBase() * precioEspecias)+(((MenuVegetariano)menu).getCantidadDeSalsas()*2);
            resp=menu.getPrecioBase()+recargos;
        }
        return resp;
    }
}
