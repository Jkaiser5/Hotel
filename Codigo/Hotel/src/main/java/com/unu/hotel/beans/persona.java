package com.unu.hotel.beans;

public class persona {
	private int idPersona;
	private String documento;
	private String nombre;
	private String apPat;
	private String apMat;
	private String direccion;
	private String telefono;
	private int idTipoPersona;
	private int idPeronsal;
	private String estado;
	public persona() {
		super();
	}
	public persona(int idPersona, String documento, String nombre, String apPat, String apMat, String direccion,
			String telefono, int idTipoPersona, int idPeronsal, String estado) {
		super();
		this.idPersona = idPersona;
		this.documento = documento;
		this.nombre = nombre;
		this.apPat = apPat;
		this.apMat = apMat;
		this.direccion = direccion;
		this.telefono = telefono;
		this.idTipoPersona = idTipoPersona;
		this.idPeronsal = idPeronsal;
		this.estado = estado;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPat() {
		return apPat;
	}
	public void setApPat(String apPat) {
		this.apPat = apPat;
	}
	public String getApMat() {
		return apMat;
	}
	public void setApMat(String apMat) {
		this.apMat = apMat;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdTipoPersona() {
		return idTipoPersona;
	}
	public void setIdTipoPersona(int idTipoPersona) {
		this.idTipoPersona = idTipoPersona;
	}
	public int getIdPeronsal() {
		return idPeronsal;
	}
	public void setIdPeronsal(int idPeronsal) {
		this.idPeronsal = idPeronsal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
