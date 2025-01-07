package com.unu.hotel.utils;

import com.unu.hotel.models.conexion;

public class prueba {
	public static void main(String[]args) {
		conexion conexion1 = new conexion();
		conexion1.abrirConexion();
		conexion1.cerrarConexion();
	}
}
