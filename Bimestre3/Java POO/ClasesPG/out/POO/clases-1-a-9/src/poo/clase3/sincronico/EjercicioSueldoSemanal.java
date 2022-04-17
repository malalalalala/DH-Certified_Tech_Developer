public class EjercicioSueldoSemanal {

    public static double calcularSueldoSemanal(int horasMax, int horasTrabajadas, double precioPorHora) {
        int horasExtra = horasTrabajadas - horasMax;
        double sueldo = horasTrabajadas * precioPorHora;
        if (horasExtra > 0) {
            sueldo = (horasTrabajadas + horasExtra * 0.5) * precioPorHora;
        }
        return sueldo;
    }

    public static void mostrarSueldoSemanal(String empleade, int horasTrabajadas) {
        double sueldo = calcularSueldoSemanal(40, horasTrabajadas, 875);
        System.out.println("El sueldo de " + empleade + " es de: $" + sueldo);
    }

    public static void main(String[] args) {
        mostrarSueldoSemanal("Julieta", 30);
        mostrarSueldoSemanal("Juana", 40);
        mostrarSueldoSemanal("Juliana", 50);
        mostrarSueldoSemanal("Julia", 60);
    }
}