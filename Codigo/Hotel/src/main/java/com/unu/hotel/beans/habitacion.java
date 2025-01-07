package com.unu.hotel.beans;

public class habitacion {
	private int idHabitacion;
	private String tipoHabitacion;
	private String descripcion;
	private double pDiario;
	private String estado;
	public habitacion() {
		super();
	}
	public habitacion(int idHabitacion, String tipoHabitacion, String descripcion, double pDiario, String estado) {
		super();
		this.idHabitacion = idHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.descripcion = descripcion;
		this.pDiario = pDiario;
		this.estado = estado;
	}
	public int getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getpDiario() {
		return pDiario;
	}
	public void setpDiario(double pDiario) {
		this.pDiario = pDiario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
