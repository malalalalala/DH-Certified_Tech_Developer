package ClaseSincrónicaInventarioMedicamento.dao.impl;

import ClaseSincrónicaInventarioMedicamento.dao.IDao;
import ClaseSincrónicaInventarioMedicamento.model.Medicamento;

import java.sql.*;
import org.apache.log4j.Logger;


public class MedicamentoDaoH2 implements IDao <Medicamento>{
    private final static Logger logger = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class));


    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_medicamentos";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "sa";
    //Se definen las sentencias SQL
//    private final static String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS medicamentos"
//            + "("
//            + " id INT PRIMARY KEY,"
//            + " codigo INT NOT NULL,"
//            + " nombre varchar(25) NOT NULL,"
//            + " laboratorio varchar(8) NOT NULL,"
//            + " cantidad INT NOT NULL,"
//            + " precio DOUBLE NOT NULL"
//            + ")";
    private final static String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS medicamentos"
            + "("
            + " id INT PRIMARY KEY AUTO_INCREMENT,"
            + " codigo INT NOT NULL,"
            + " nombre varchar(25) NOT NULL,"
            + " laboratorio varchar(8) NOT NULL,"
            + " cantidad INT NOT NULL,"
            + " precio DOUBLE NOT NULL"
            + ")";


    //SQL para insertar registros
//    private final static String SQL_INSERT = "INSERT INTO medicamentos (id, codigo, nombre, laboratorio,cantidad,precio) VALUES (?,?,?,?,?,?)";
    private final static String SQL_INSERT = "INSERT INTO medicamentos ( codigo, nombre, laboratorio,cantidad,precio) VALUES (?,?,?,?,?)";
//    private final static String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID = ?";
//SQL para buscar medicamentos
    private final static String SQL_FIND="SELECT * FROM medicamentos WHERE id=?";


    public static Connection connecti(){
        Connection connection=null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            logger.info("Conexión exitosa, se ha creado la tabla");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }



    @Override
    public Medicamento guardar(Medicamento medicamento) throws SQLException {

        PreparedStatement psInsert = MedicamentoDaoH2.connecti().prepareStatement(SQL_INSERT);
//        psInsert.setInt(1, medicamento.getId());
        psInsert.setInt(1, medicamento.getCodigo());
        psInsert.setString(2, medicamento.getNombre());
        psInsert.setString(3, medicamento.getLaboratorio());
        psInsert.setInt(4, medicamento.getCantidad());
        psInsert.setDouble(5, medicamento.getPrecio());

        psInsert.execute();//se ejecuta en la BD
        logger.info("Se han insertado datos en la tabla del medicamento"+ medicamento.getNombre());

        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) throws SQLException {
     PreparedStatement psQuery=MedicamentoDaoH2.connecti().prepareStatement(SQL_FIND);
        //
        //Statement st=MedicamentoDaoH2.connecti().createStatement();
     psQuery.setInt(1,id);
     logger.info("buscando medicamento con id"+id);
     //Obtener resultado
     ResultSet rs=psQuery.executeQuery();
     Medicamento medicamento=null;

     //armar objeto con datos obtenidos
        while (rs.next()){
            logger.info("armando objeto del medicamento "+rs.getInt(1)+"-"+rs.getInt(2)+"-"+rs.getString(3));
            Integer idMed=rs.getInt(1);
            Integer codigo= rs.getInt(2);
            String nombre=rs.getString(3);
            String laboratorio=rs.getString(4);
            Integer cantidad = rs.getInt(5);
            Double precio = rs.getDouble(6);


            medicamento = new Medicamento( idMed,codigo, nombre, laboratorio, cantidad, precio );
        }

        return medicamento;
    }
}
