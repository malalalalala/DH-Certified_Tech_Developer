package ClaseSincrónicaInventarioMedicamento.service;

import ClaseSincrónicaInventarioMedicamento.dao.impl.MedicamentoDaoH2;
import ClaseSincrónicaInventarioMedicamento.model.Medicamento;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class MedicamentoServiceTest {

    private MedicamentoService medicamentoService=new MedicamentoService(new MedicamentoDaoH2());

 @Test
    public void guardarMedicamento() throws SQLException {
     Medicamento medicamento=new Medicamento(123,"paracetamol","b",1,150.00);

     medicamentoService.guardar(medicamento);
     Assert.assertTrue(medicamentoService.buscar(1)!=null);
    }

    @Test
    public void buscarPorId() throws SQLException {
        Medicamento medicamentoEncontrado= medicamentoService.buscar(1);
        //Assert.assertTrue(medicamentoEncontrado != null);
        Assert.assertNotNull(medicamentoEncontrado);
    }

}