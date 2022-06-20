package MesaDeTrabajoMenusRodo;

public class CocineroMenuInfantil extends CocineroDeMenu{
    @Override
    protected String armar(Menu menu) {
        return "1-Colocar juguetes\n 2-Preparar ingredientes\n3-Cocinar ingredientes.\n";
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        double resp=0;
        if(menu instanceof MenuInfantil){
            resp=menu.getPrecioBase()+3*((MenuInfantil)menu).getCantidadJuguetes();
        }
        return resp;
    }
}
