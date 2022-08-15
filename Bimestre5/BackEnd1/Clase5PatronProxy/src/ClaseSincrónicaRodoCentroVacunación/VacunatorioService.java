package ClaseSincrónicaRodoCentroVacunación;

public class VacunatorioService implements Vacunatorio{
    @Override
    public String vacunar(Paciente paciente) {
        System.out.println("atentiendo a "+paciente.getNombre());
        System.out.println("Verificando y aceptando su info personal");
        return "Se ha registrado el DNI " +paciente.getDNI()+" como persona vacunada con " +paciente.getNombreVacuna();
    }

}
