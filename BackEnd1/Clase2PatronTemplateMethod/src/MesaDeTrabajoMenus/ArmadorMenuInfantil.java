package MesaDeTrabajoMenus;

public class ArmadorMenuInfantil extends ArmadorDeMenu{


    @Override
    protected String armar(Menu menu) {
        String mensaje="El menú debe ser infantil";
        if (menu instanceof MenuInfantil){
            mensaje = "1-Agregar adornos: "+((MenuInfantil)menu).getCantidadDeJueguetes() +" .\n2-Agregar comida.\n3-Cocinar comida.";
        }

        return mensaje;
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        double resp=0;
        if(menu instanceof MenuInfantil){
            resp=menu.getPrecioBase()+(3*((MenuInfantil)menu).getCantidadDeJueguetes());
        }
        return resp;
    }
}
