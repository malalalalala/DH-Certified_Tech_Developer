package MesaDeTrabajoMenus;

public abstract class ArmadorDeMenu {
    public String preparar(Menu menu){
        String resp="Iniciando el armado del menú.\n";
        resp=resp+armar(menu);

        return resp;
    }
    protected abstract String armar(Menu menu);
    protected abstract double calcularPrecio(Menu menu);

}
