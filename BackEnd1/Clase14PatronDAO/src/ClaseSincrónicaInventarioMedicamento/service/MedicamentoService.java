package ClaseSincrónicaInventarioMedicamento.service;

import ClaseSincrónicaInventarioMedicamento.dao.IDao;
import ClaseSincrónicaInventarioMedicamento.model.Medicamento;

import java.sql.SQLException;

public class MedicamentoService {
    //Atributos
    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    //Operaciones
    public Medicamento guardar(Medicamento medicamento) throws SQLException {
     return medicamentoDao.guardar(medicamento);
    }

    public Medicamento buscar(Integer id) throws SQLException {
        return medicamentoDao.buscar(id);
    }

}
