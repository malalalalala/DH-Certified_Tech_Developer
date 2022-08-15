package MesaDeTrabajoBúsquedaVuelos;

public class Vuelo {
    private String FechaDeSalida;
    private String FechaDeRegreso;
    private String Origen;
    private String Destino;

    public Vuelo(String fechaDeSalida, String fechaDeRegreso, String origen, String destino) {
        FechaDeSalida = fechaDeSalida;
        FechaDeRegreso = fechaDeRegreso;
        Origen = origen;
        Destino = destino;
    }

    public String getFechaDeSalida() {
        return FechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        FechaDeSalida = fechaDeSalida;
    }

    public String getFechaDeRegreso() {
        return FechaDeRegreso;
    }

    public void setFechaDeRegreso(String fechaDeRegreso) {
        FechaDeRegreso = fechaDeRegreso;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    @Override
    public String toString() {
        return "**Vuelo{" +
                "FechaDeSalida='" + FechaDeSalida + '\'' +
                ", FechaDeRegreso='" + FechaDeRegreso + '\'' +
                ", Origen='" + Origen + '\'' +
                ", Destino='" + Destino + '\'' +
                '}';
    }
}
