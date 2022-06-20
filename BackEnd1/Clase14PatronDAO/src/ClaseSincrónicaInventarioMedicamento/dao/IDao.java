package ClaseSincrónicaInventarioMedicamento.dao;


import java.sql.SQLException;

public interface IDao <T> {

    public T guardar(T t) throws SQLException;

    public T buscar(Integer id) throws SQLException;




}
