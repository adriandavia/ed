package org.institutoserpis.ed;

import java.sql.*;

public class PruebaCategoria {
	public static void main(String[] args) throws SQLException{
		System.out.println("GMySql inicio");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dbprueba", "root", "sistemas");
		//TODO LO QUE QUIERAS HACER EN LA BASE DE DATOS 
		
		//Leer los registros de la tabla categoria
		Statement selectStatement = connection.createStatement();
		ResultSet resultSet = selectStatement.executeQuery("select * from categoria");
		while (resultSet.next()) {
			System.out.printf("id = %s nombre = %s \n",resultSet.getObject("id"), resultSet.getObject("nombre"));
		}				
		selectStatement.close();
		
		connection.close();
		
		System.out.println("Fin");
	}
}
