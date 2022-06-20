package MesaDeTrabajoBúsquedaVuelos;

public class Hotel {
    private String FechaDeEntrada;
    private String FechaDeSalida;
    private String Ciudad;

     public Hotel(String fechaDeEntrada, String fechaDeSalida, String ciudad) {
        FechaDeEntrada = fechaDeEntrada;
        FechaDeSalida = fechaDeSalida;
        Ciudad = ciudad;
    }

    public String getFechaDeEntrada() {
        return FechaDeEntrada;
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        FechaDeEntrada = fechaDeEntrada;
    }

    public String getFechaDeSalida() {
        return FechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        FechaDeSalida = fechaDeSalida;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "**Hotel{" +
                "FechaDeEntrada='" + FechaDeEntrada + '\'' +
                ", FechaDeSalida='" + FechaDeSalida + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                '}';
    }
}
