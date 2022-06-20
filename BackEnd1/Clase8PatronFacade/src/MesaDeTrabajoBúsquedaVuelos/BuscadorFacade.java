package MesaDeTrabajoBúsquedaVuelos;

public class BuscadorFacade implements IBuscador{
    private ApiHotel apiHotel;
    private ApiVuelo apiVuelo;

    public BuscadorFacade() {
        this.apiHotel = new ApiHotel();
        this.apiVuelo = new ApiVuelo();
    }

    @Override
    public void BuscarServicioViaje(Vuelo vuelo, Hotel hotel) {

        System.out.println("El vuelo y el hotel encontrado son: ");
        System.out.println(apiHotel.BuscarServicioViaje(hotel));
        System.out.println(apiVuelo.BuscarServicioViaje(vuelo));

    }
}
