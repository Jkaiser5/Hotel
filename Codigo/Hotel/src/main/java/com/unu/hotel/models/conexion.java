package com.unu.hotel.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	private String url="jdbc:mysql://localhost:3306/hotel";
	private String usuario="root";
	private String contraseña="123456";
	private String Driver="com.mysql.cj.jdbc.Driver";
	protected Connection conexion;
	
	public void abrirConexion() {
		try {
			Class.forName(Driver);
			conexion=DriverManager.getConnection(url, usuario, contraseña);
			System.out.println("conexion exitosa");
		}catch (ClassNotFoundException | SQLException e){
			
		}
	}
	
	public void cerrarConexion() {
		try {
			if (conexion!=null && !conexion.isClosed()) {
				conexion.close();
				System.out.println("conexion cerrada");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
