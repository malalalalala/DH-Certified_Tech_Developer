package dao.impl;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DomicilioDaoH2 {
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    //con la instruccion INIT=RUNSCRIPT cuando se conecta a la base ejecuta el script de sql que esta en dicho archivo
    private final static String DB_URL = "jdbc:h2:~/db_clinica15;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "sa";

    private static final Logger logger = Logger.getLogger(PacienteDaoH2.class);

    public static Connection getConnection()  {
        Connection connection = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            logger.info("Conexión exitosa a la tabla");


        }  catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            logger.error("error de conexión a la BD");
        }
        return connection;
    }
}
