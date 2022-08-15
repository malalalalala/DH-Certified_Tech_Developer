package com.dh.clase23;

import com.dh.clase23.repository.H2Aux;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Clase23Application {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		H2Aux.getConnectionWithScript();
		SpringApplication.run(Clase23Application.class, args);
	}

	private static void prepararBD(){
		Connection connection=null;
		try{
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection("jdbc:h2:~/cam94clase24;INIT=RUNSCRIPT " +
					" FROM 'create.sql'","sa","sa");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try{
				connection.close();
			}
			catch (Exception ex){
				ex.printStackTrace();
			}
		}
	}

}
