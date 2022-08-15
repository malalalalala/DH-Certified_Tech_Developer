package com.monterrosa.tp2.dao.impl;

import com.monterrosa.tp2.dao.IDao;
import com.monterrosa.tp2.model.Domicilio;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.util.ConfiguracionJDBC;
import com.monterrosa.tp2.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {
//    private static final Logger logger = (Logger) LogManager.getLogger(OdontologoDaoH2.class);

    private static final Logger logger = LogManager.getLogger(OdontologoDaoH2.class);

    ConfiguracionJDBC database = new ConfiguracionJDBC();
    Connection connection = null;
    PreparedStatement ps = null;

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("Guardando el odontologo: " + odontologo);

        connection = database.conectarConBaseDeDatos();
        ps = null;

        try {

            logger.info("Conexión establecida correctamente.");

            logger.info("Tabla de odontologos recreada correctamente.");

            String SQL_INSERT= "insert into odontologos (numero_de_matricula, nombre, apellido) VALUES (?,?,?);";

            ps= connection.prepareStatement(SQL_INSERT,Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,odontologo.getNumeroDeMatricula());
            ps.setString(2,odontologo.getNombre());
            ps.setString(3,odontologo.getApellido());

            ps.executeUpdate();
            ResultSet keys = ps.getGeneratedKeys();
            if(keys.next())
                odontologo.setId(keys.getInt(1));

            ps.close();
            logger.info("Registro insertado correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("Error de base de datos: ",e);
        }

        return odontologo;
    }



    @Override
    public Odontologo buscar(Integer id) {
        logger.info("Buscando el odontologo con el ID: " + id);

        connection = database.conectarConBaseDeDatos();
        PreparedStatement ps = null;
        Odontologo odontologo = null;

        try {
            logger.info("Conexión establecida correctamente.");

            String SQL_SELECT= "SELECT * FROM odontologos WHERE id = ?";
            ps= connection.prepareStatement(SQL_SELECT);
            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();
            logger.info("Query Select ejecutada satisfactoriamente.");

            while(result.next()){
                int idOdontologo= result.getInt("id");
                String numeroDeMatricula = result.getString("numero_de_matricula");
                String nombre= result.getString("nombre");
                String apellido= result.getString("apellido");

                odontologo= new Odontologo(idOdontologo,numeroDeMatricula,nombre,apellido);
                logger.info("Informacion del odontologo: "+odontologo);
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return odontologo;
    }

    @Override
    public void eliminar(Integer id) {
        connection = database.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;
        try {
            //2 Crear una sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM odontologos where id = ?");
            preparedStatement.setInt(1,id);

            //3 Ejecutar una sentencia SQL
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("Listando a todos los Odontologos");

        connection = database.conectarConBaseDeDatos();
        Statement st = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            logger.info("Conexión establecida correctamente.");

            String SQL_SELECT= "SELECT * FROM odontologos";
            st= connection.createStatement();

            ResultSet result = st.executeQuery(SQL_SELECT);

            logger.info("Query Select ejecutada satisfactoriamente.");


            while(result.next()) {
                int idOdontologo= result.getInt("id");
                String numeroDeMatricula = result.getString("numero_de_matricula");
                String nombre= result.getString("nombre");
                String apellido= result.getString("apellido");

                Odontologo odontologo= new Odontologo(idOdontologo,numeroDeMatricula,nombre,apellido);
                logger.info("Informacion del odontologo: "+odontologo);
                odontologos.add(odontologo);
            }

            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return odontologos;
    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) {

        connection = database.conectarConBaseDeDatos();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("UPDATE odontologos SET numero_de_matricula=?, nombre=?, apellido=? WHERE id = ?");
            preparedStatement.setString(1, odontologo.getNumeroDeMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.setInt(4, odontologo.getId());

            //3 Ejecutar una sentencia SQL
            preparedStatement.executeUpdate();


            preparedStatement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return odontologo;

    }


}
