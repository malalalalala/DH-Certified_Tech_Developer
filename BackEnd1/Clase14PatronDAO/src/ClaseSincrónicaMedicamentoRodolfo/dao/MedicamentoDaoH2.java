package ClaseSincrónicaMedicamentoRodolfo.dao;

import ClaseSincrónicaMedicamentoRodolfo.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.*;

public class MedicamentoDaoH2 implements IDao <Medicamento>{
    private final static Logger logger =  Logger.getLogger(MedicamentoDaoH2.class);
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_medicamentosRodo";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "sa";
    private final static String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS medicamentos"
            + "("
            + " id INT PRIMARY KEY,"
            + " codigo INT NOT NULL,"
            + " nombre varchar(25) NOT NULL,"
            + " laboratorio varchar(8) NOT NULL,"
            + " cantidad INT NOT NULL,"
            + " precio DOUBLE NOT NULL"
            + ")";

    //SQL para insertar registros
    private final static String SQL_INSERT = "INSERT INTO medicamentos ( codigo, nombre, laboratorio,cantidad,precio) VALUES (?,?,?,?,?)";
    //    private final static String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID = ?";
//SQL para buscar medicamentos
    private final static String SQL_FIND="SELECT * FROM medicamentos WHERE id=?";

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        logger.info("se comienza una operación de guardado");
        Connection connection=null;
        try{
            connection=getConnection();
            PreparedStatement psInsert=connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1, medicamento.getCodigo());
            psInsert.setString(2, medicamento.getNombre());
            psInsert.setString(3, medicamento.getLaboratorio());
            psInsert.setInt(4, medicamento.getCantidad());
            psInsert.setDouble(5, medicamento.getPrecio());

            psInsert.execute();

        }
        catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                logger.error("No se pudo cerrar la conexión. " +ex.getMessage()) ;
                ex.printStackTrace();
            }

        }

        return medicamento;
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DB_JDBC_DRIVER);
        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

    }


}
