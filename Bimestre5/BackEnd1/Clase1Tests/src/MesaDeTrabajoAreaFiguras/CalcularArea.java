package MesaDeTrabajoAreaFiguras;

public class CalcularArea {
    private String nombre;
    private double valor;
    private final double pi= Math.PI;

    public CalcularArea(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public boolean valorMayorAcero(){
        return this.valor >0;
    }

    public double CalcularAreaCirculo(){
        if(this.valorMayorAcero()){
            double area= Math.round(pi*(Math.pow(this.valor, 2)));
            System.out.println("el area del " + this.nombre + " es " +area);
            return area;
        }else{
            System.out.println("el valor del radio debe ser mayor a cero");
            return 0.0;
        }
    }

    public double CalcularAreaCuadrado(){
        if(this.valorMayorAcero()){
            double area= Math.round(Math.pow(this.valor,2));
            System.out.println("el area del " + this.nombre + " es " + area);
            return area;
        }else{
            System.out.println("el valor del lado debe ser mayor a cero");
            return 0.0;
        }
    }


}
