package MesaDeTrabajoAreaFiguras;

public class CalculadoraDeAreas {
    public String calcularAreaCirculo(double radio){
        String respuesta="El valor del radio debe ser mayor que cero";
        if (radio>0){
            //realizar el procedimiento del área
            respuesta="El área del círculo es de " +Math.PI*Math.pow(radio,2)+ " unidades";
        }
        return respuesta;
    }
    public String calcularAreaCuadrado(double lado){
        String respuesta="El valor del lado debe ser mayor que cero";
        if (lado>0){
            //realizar el procedimiento del área
            respuesta="El área del cuadrado es de " +Math.round(Math.pow(lado,2))+ " unidades";
        }
        return respuesta;
    }
}
