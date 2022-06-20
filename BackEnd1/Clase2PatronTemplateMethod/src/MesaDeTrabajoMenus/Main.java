package MesaDeTrabajoMenus;

public class Main {
    public static void main(String[] args) {

        MenuClasico menu1 = new MenuClasico(12000);
        MenuInfantil menu2 = new MenuInfantil(12000,2);
        MenuVegetariano menu3 = new MenuVegetariano(11500,3,true);

       ArmadorMenuInfantil armado = new ArmadorMenuInfantil();

        System.out.println(armado.preparar(menu2)+"\n \n El precio es: "+ armado.calcularPrecio(menu2));

    }
}
