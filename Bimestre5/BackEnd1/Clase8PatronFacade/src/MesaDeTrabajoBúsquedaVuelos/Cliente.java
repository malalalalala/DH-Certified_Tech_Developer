package MesaDeTrabajoBúsquedaVuelos;

public class Cliente {
    public static void main(String[] args) {
        BuscadorFacade buscador=new BuscadorFacade();
        Hotel DeCameron=new Hotel("mayo","junio","San Salvador de Jujuy");
        Vuelo MedellinJujuy= new Vuelo("mayo","junio","Medellin","Jujuy");

        buscador.BuscarServicioViaje(MedellinJujuy,DeCameron);


    }
}
