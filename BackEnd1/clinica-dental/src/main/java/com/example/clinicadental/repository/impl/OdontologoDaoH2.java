package com.example.clinicadental.repository.impl;


import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.repository.configuration.Configuration;
import com.example.clinicadental.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_clinicaD;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "sa";

    //Sentencias SQL
//    private final static String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS odontologos"
//            + "("
//            + " id INT PRIMARY KEY AUTO_INCREMENT,"
//            + " nroMatricula INT NOT NULL,"
//            + " nombre varchar(25) NOT NULL,"
//            + " apellido varchar(25) NOT NULL"
//            + ");";

    //SQL para insertar registros
    private final static String SQL_INSERT = "INSERT INTO odontologos ( nroMatricula, nombre, apellido) VALUES (?,?,?)";

    //SQL para listar todos los odontólogos
    private final static String SQL_FINDALL="SELECT * FROM odontologos ";
    private final static String SQL_FIND="SELECT * FROM odontologos where id = ? ";
    private final static String SQL_DELETE="DELETE FROM odontologos where id = ? ";

    private final static String SQL_UPDATE="UPDATE odontologos SET nroMatricula=?, nombre=?, apellido=? WHERE id = ?";


    private static final Logger logger = Logger.getLogger(OdontologoDaoH2.class);


//    public static Connection getConnection()  {
//        Connection connection = null;
//        try {
//            Class.forName(DB_JDBC_DRIVER);
//            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
//
//            Statement statement = connection.createStatement();
//            logger.info("Conexión exitosa a la tabla");
//
//
//        }  catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            logger.error("error de conexión a la BD");
//        }
//        return connection;
//    }

    Configuration configuracion=new Configuration();

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        PreparedStatement psInsert=null;
        //1 Levantar el driver y conectarnos
        try {

            //2 Crear una sentencia
            psInsert=configuracion.conectarConBaseDeDatos().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setInt(1,odontologo.getNroMatricula());
            psInsert.setString(2,odontologo.getNombre());
            psInsert.setString(3,odontologo.getApellido());

            //3 Ejecutar una sentencia SQL y obtener los ID que se autogeneraron en la base de datos

            psInsert.executeUpdate();
            ResultSet keys = psInsert.getGeneratedKeys();
            if(keys.next())
                odontologo.setId(keys.getInt(1));
            logger.info("se ha insertado el registro con matricula " + odontologo.getNroMatricula()+ " correspondiente a "+odontologo.getNombre()+odontologo.getApellido()+" en la BD");
            psInsert.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la inserción del registro a la BD");

        }
        return odontologo;
    }

    @Override
    public Odontologo buscar(Integer id) {
        PreparedStatement psFind=null;
        Odontologo odontologo = null;
        try {
            //2 Crear una sentencia
            psFind=configuracion.conectarConBaseDeDatos().prepareStatement(SQL_FIND);
            psFind.setInt(1,id);
            //3 Ejecutar una sentencia SQL
            ResultSet result = psFind.executeQuery();

            //4 Obtener resultados
            while (result.next()) {
                Integer idOdontologo = result.getInt("id");
                Integer nroMatricula = result.getInt("nroMatricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                odontologo = new Odontologo(idOdontologo,nroMatricula,nombre,apellido);
            }

            psFind.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la búsqueda del registro a la BD");
        }

        return odontologo;
    }

    @Override
    public void eliminar(Integer id) {
        PreparedStatement psDelete=null;
        //1 Levantar el driver y conectarnos
        try {
            //2 Crear una sentencia
            psDelete=configuracion.conectarConBaseDeDatos().prepareStatement(SQL_DELETE);
            psDelete.setLong(1,id);

            //3 Ejecutar una sentencia SQL
            psDelete.executeUpdate();
            psDelete.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error en la eliminando del registro a la BD");
        }

    }

    @Override
    public List<Odontologo> buscarTodos() {
        PreparedStatement psBuscarTodos=null;
        List<Odontologo> odontologos=new ArrayList<>();
        Odontologo odontologo=null;

        try {

            //1 conectarme y crear sentencia
            psBuscarTodos=configuracion.conectarConBaseDeDatos().prepareStatement(SQL_FINDALL);

            //3 Ejecutar la setencia

            ResultSet rs = psBuscarTodos.executeQuery();

            //Armar objeto con datos obtenidos
            while (rs.next()) {
                logger.info("buscando la información del odontólogo");

                Integer idOdontologo = rs.getInt(1);
                Integer nroMatricula = rs.getInt(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);

                odontologo = new Odontologo( idOdontologo,nroMatricula,nombre, apellido );

                odontologos.add(odontologo);
            }
            logger.info("la lista de odontólogos es "+odontologos);
            psBuscarTodos.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("error buscando los odontólogos en la BD");

        }

        return odontologos;
    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) {
        PreparedStatement psUpdate=null;
        //1 Levantar el driver y conectarnos
        try {
            //2 Crear una sentencia
            psUpdate=configuracion.conectarConBaseDeDatos().prepareStatement(SQL_UPDATE);
            //No le vamos a pasar el ID ya que hicimos que fuera autoincremental en la base de datos
            psUpdate.setInt(1,odontologo.getNroMatricula());
            psUpdate.setString(2,odontologo.getNombre());
            psUpdate.setString(3,odontologo.getApellido());
            psUpdate.setLong(4,odontologo.getId());

            //3 Ejecutar una sentencia SQL
            psUpdate.executeUpdate();
            psUpdate.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return odontologo;
    }


}
