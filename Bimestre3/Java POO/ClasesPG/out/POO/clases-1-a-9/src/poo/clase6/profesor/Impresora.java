public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;
    private int maxHojas;
    private String color;
    private boolean encendida;

    public Impresora(String modelo, String tipoConexion, int maxHojas, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.maxHojas = maxHojas;
        this.fechaFabricacion = fechaFabricacion;
    }

    public Impresora(String modelo, String tipoConexion, int maxHojas) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.maxHojas = maxHojas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public int getMaxHojas() {
        return maxHojas;
    }

    public void setMaxHojas(int maxHojas) {
        this.maxHojas = maxHojas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        System.out.println("\tEncendiendo impresora...");
        this.encendida = true;
    }

    public void apagar() {
        System.out.println("\tApagando impresora...");
        this.encendida = false;
    }

    public void imprimir(String texto) {
        if (this.encendida) {
            if (this.tienePapel()) {
                System.out.println("\tImprimiendo..." + "\n\t"+ texto);
                this.hojasDisponibles--;
            } else {
                System.out.println("\tOoops, no hay papel :c");
            }
        }
    }

    public void cargarHojas(int cdadHojas) {
        if(cdadHojas < this.maxHojas) {
            System.out.println("\tAgregando " + cdadHojas + "hojas");
            this.hojasDisponibles += cdadHojas;
        } else {
            System.out.println("\tOoops, la cantidad de papel que me querés cargar es una bocha, aguanto hasta "+ maxHojas + " nomas :c");
        }
    }

    private boolean tienePapel() {
        return this.hojasDisponibles > 0;
    }
}
