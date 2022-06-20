package ClaseSincrónicaInventarioMedicamento;

import ClaseSincrónicaInventarioMedicamento.dao.impl.MedicamentoDaoH2;
import ClaseSincrónicaInventarioMedicamento.model.Medicamento;
import ClaseSincrónicaInventarioMedicamento.service.MedicamentoService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        //Creo un objeto medicamento
//        Medicamento medicamento=new Medicamento(1,123,"paracetamol","b",1,150.00);
        Medicamento medicamento=new Medicamento(123,"paracetamol","b",1,150.00);


        //creo un servicios
        MedicamentoService medicamentoService=new MedicamentoService(new MedicamentoDaoH2());

        //Esto debería guardar la tabla en la BD
        //medicamentoService.guardar(medicamento);

        Medicamento medicamentoBuscado=medicamentoService.buscar(1);
        System.out.println(medicamentoBuscado);


    }
}
