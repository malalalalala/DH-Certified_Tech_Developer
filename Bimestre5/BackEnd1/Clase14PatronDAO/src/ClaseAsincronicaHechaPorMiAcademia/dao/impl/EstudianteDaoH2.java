package ClaseAsincronicaHechaPorMiAcademia.dao.impl;

import ClaseAsincronicaHechaPorMiAcademia.dao.IDao;
import ClaseAsincronicaHechaPorMiAcademia.model.Estudiante;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoH2 implements IDao<Estudiante>{
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_estudiantes";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "sa";

    //Cerar sentencia SQL
    private final static String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS estudiantes"
            + "("
            + " id INT PRIMARY KEY,"
            + " nombre varchar(25) NOT NULL,"
            + " apellido varchar(25) NOT NULL"
            + ");";
    //SQL para insertar registros
    private final static String SQL_INSERT = "INSERT INTO estudiantes VALUES (?,?,?)";
    //    private final static String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID = ?";
//SQL para buscar estudiante
    private final static String SQL_FIND="SELECT * FROM estudiantes WHERE id=?";
    //SQL para buscar todos los estudiantes
    private final static String SQL_FINDALL="SELECT * FROM estudiantes ";
    //SQL para eliminar estudiante
    private final static String SQL_DELETE="DELETE FROM estudiantes WHERE id=?";
    private static final Logger logger = Logger.getLogger(EstudianteDaoH2.class);
    public static Connection getConnection()  {
        Connection connection = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            logger.info("Conexión exitosa a la tabla");

        }  catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            logger.error("error de conexión a la BD");
        }
        return connection;
    }


    @Override
    public Estudiante guardar(Estudiante estudiante) {

        PreparedStatement psInsert=null;
        //1 Levantar el driver y conectarnos
        try {

            //2 Crear una sentencia
            psInsert=getConnection().prepareStatement(SQL_INSERT);
            psInsert.setLong(1,estudiante.getId());
            psInsert.setString(2,estudiante.getNombre());
            psInsert.setString(3,estudiante.getApellido());

            //3 Ejecutar la setencia

            psInsert.execute();
            logger.info("se ha insertado el registro con id " + estudiante.getId()+" en la BD");
            psInsert.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la inserción del registro a la BD");

        }
        return estudiante;
    }

    @Override
    public void eliminar(Long id) {

        PreparedStatement psDelete=null;
        //1 Levantar el driver y conectarnos
        try {

            //2 Crear una sentencia
            psDelete=getConnection().prepareStatement(SQL_DELETE);
            psDelete.setLong(1,id);

            //3 Ejecutar la setencia

            psDelete.execute();
            logger.info("se ha eliminado el registro con id " + id +" de la BD");
            psDelete.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la eliminación del registro a la BD");

        }


    }

    @Override
    public Estudiante buscar(Long id) {
        PreparedStatement psBuscar=null;
        Estudiante estudiante=null;
        //1 Levantar el driver y conectarnos
        try {

            //2 Crear una sentencia
            psBuscar=getConnection().prepareStatement(SQL_FIND);
            psBuscar.setLong(1,id);

            //3 Ejecutar la setencia

            ResultSet rs = psBuscar.executeQuery();

            //Armar objeto con datos obtenidos
            while (rs.next()) {
                Long idEst = rs.getLong(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                //System.out.println(rs.getInt(1) + " - " + rs.getInt(2) + " - " + rs.getString(3));

                estudiante = new Estudiante( idEst,nombre, apellido );

                logger.info("se ha encontrado el estudiante: "+estudiante);
            }
            psBuscar.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la eliminación del registro a la BD");

        }

        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        PreparedStatement psBuscarTodos=null;
        List<Estudiante> estudiantes=new ArrayList<>();
        Estudiante estudiante=null;
        //1 Levantar el driver y conectarnos
        try {

            //2 Crear una sentencia
            psBuscarTodos=getConnection().prepareStatement(SQL_FINDALL);

            //3 Ejecutar la setencia

            ResultSet rs = psBuscarTodos.executeQuery();

            //Armar objeto con datos obtenidos
            while (rs.next()) {
                Long idEst = rs.getLong(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                //System.out.println(rs.getInt(1) + " - " + rs.getInt(2) + " - " + rs.getString(3));

                estudiante = new Estudiante( idEst,nombre, apellido );

                estudiantes.add(estudiante);
            }
            logger.info("la lista de estudiantes es "+estudiantes);
            psBuscarTodos.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la eliminación del registro a la BD");

        }

        return estudiantes;
    }
}
