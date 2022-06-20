package com.example.Clase25asincronicaMedicamentos.dao.impl;


import com.example.Clase25asincronicaMedicamentos.dao.IDao;
import com.example.Clase25asincronicaMedicamentos.dao.configuration.Configuration;
import com.example.Clase25asincronicaMedicamentos.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.*;


public class MedicamentoDaoH2 implements IDao<Medicamento> {
    private final static Logger logger = Logger.getLogger((MedicamentoDaoH2.class));


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
//    private final static String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS medicamentos"
//            + "("
//            + " id INT PRIMARY KEY AUTO_INCREMENT,"
//            + " codigo INT NOT NULL,"
//            + " nombre varchar(25) NOT NULL,"
//            + " laboratorio varchar(8) NOT NULL,"
//            + " cantidad INT NOT NULL,"
//            + " precio DOUBLE NOT NULL"
//            + ")";


    //SQL para insertar registros
//    private final static String SQL_INSERT = "INSERT INTO medicamentos (id, codigo, nombre, laboratorio,cantidad,precio) VALUES (?,?,?,?,?,?)";
    private final static String SQL_INSERT = "INSERT INTO medicamentos ( codigo, nombre, laboratorio,cantidad,precio) VALUES (?,?,?,?,?)";
//    private final static String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID = ?";
//SQL para buscar medicamentos
    private final static String SQL_FIND="SELECT * FROM medicamentos WHERE id=?";

    static Configuration configuracion=new Configuration();

    @Override
    public Medicamento guardar(Medicamento medicamento)  {
        PreparedStatement psInsert=null;

        try {
            psInsert = MedicamentoDaoH2.configuracion.conectarConBaseDeDatos().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            //        psInsert.setInt(1, medicamento.getId());
            psInsert.setInt(1, medicamento.getCodigo());
            psInsert.setString(2, medicamento.getNombre());
            psInsert.setString(3, medicamento.getLaboratorio());
            psInsert.setInt(4, medicamento.getCantidad());
            psInsert.setDouble(5, medicamento.getPrecio());

            psInsert.execute();//se ejecuta en la BD
            logger.info("Se han insertado datos en la tabla del medicamento"+ medicamento.getNombre());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        PreparedStatement psQuery= null;
        Medicamento medicamento=null;
        try {
            psQuery = MedicamentoDaoH2.configuracion.conectarConBaseDeDatos().prepareStatement(SQL_FIND);
            //
            //Statement st=MedicamentoDaoH2.connecti().createStatement();
            psQuery.setInt(1,id);
            logger.info("buscando medicamento con id"+id);
            //Obtener resultado
            ResultSet rs=psQuery.executeQuery();


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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return medicamento;
    }
}
