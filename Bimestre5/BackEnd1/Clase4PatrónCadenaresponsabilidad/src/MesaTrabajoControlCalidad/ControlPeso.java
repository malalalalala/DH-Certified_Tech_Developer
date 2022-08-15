package MesaTrabajoControlCalidad;

public class ControlPeso extends AnalistaDeCalidad{

       @Override
    public void verificarCalidad(Articulo articulo) {
           System.out.println("pasando por control de peso");
        if(articulo.getPeso() <= 1300 && articulo.getPeso() >= 1200){
            getSigAnalistaDeCalidad().verificarCalidad(articulo);
        }else{
            System.out.println("No se pudo realizar la solicitud de control. Fallo control peso");
        }
    }
}
