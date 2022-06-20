package MesaTrabajoControlCalidad;

public class ControlLote extends AnalistaDeCalidad {
    @Override
    public void verificarCalidad(Articulo articulo) {
        System.out.println("pasando por control de lote");
        if(articulo.getLote() <= 2000 && articulo.getLote() >= 1000){
            this.getSigAnalistaDeCalidad().verificarCalidad(articulo);
        }else{
            System.out.println("No se pudo realizar la solicitud de control. Fallo control lote");
        }
    }


}
