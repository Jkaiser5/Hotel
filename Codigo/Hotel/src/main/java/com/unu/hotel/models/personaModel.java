package com.unu.hotel.models;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unu.hotel.beans.persona;

public class personaModel extends conexion{
	CallableStatement cs;
	ResultSet rs;
	
	public List<persona> listarPersona(){
		try {
			List<persona> Listar = new ArrayList<>();
			String sql = "call sp_buscarPersona()";
			this.abrirConexion();
			cs=conexion.prepareCall(sql);
			rs=cs.executeQuery();
			while (rs.next()) {
				persona Persona = new persona();
				Persona.setIdPersona(rs.getInt("idCliente"));
				Persona.setDocumento(rs.getString("documento"));
				Persona.setNombre(rs.getNString("nombre"));
				Persona.setApMat(rs.getNString("apPat"));
				Persona.setApMat(rs.getNString("apMat"));
				Persona.setDireccion(rs.getNString("direccion"));
				Persona.setTelefono(rs.getNString("telefono"));				
				Listar.add(Persona);
			}
			this.cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
			this.cerrarConexion();
			return null;
			// TODO: handle exception
		}
	}
	
	
	
}