package com.unu.hotel.beans;

public class usuario {
	private int idUsuario;
	private String username;
	private String password;
	private int idPersona;
	public usuario() {
		super();
	}
	public usuario(int idUsuario, String username, String password, int idPersona) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.idPersona = idPersona;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
}
