package MesaTrabajoControlCalidad;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Articulo articulo1 = new Articulo("Carlos", 1500, 12, "casi sano");
//
//        AnalistaDeCalidad analisis1 = new ControlLote(articulo1);
//        AnalistaDeCalidad analisis2 = new ControlPeso(articulo1);
//        AnalistaDeCalidad analisis3 = new ControlEnvase(articulo1);
//
//        analisis1.setSigAnalistaDeCalidad(analisis2);
//        analisis2.setSigAnalistaDeCalidad(analisis3);
//        analisis1.verificarCalidad();

        CompruebaCalidad controlador=new CompruebaCalidad();
        Articulo computador= new Articulo("computador",1500,1250,"sano");
        controlador.iniciarComprobacion(computador);
    }
}
