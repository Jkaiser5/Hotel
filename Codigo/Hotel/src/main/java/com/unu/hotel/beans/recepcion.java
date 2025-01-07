package com.unu.hotel.beans;

import java.sql.Date;

public class recepcion {
	private int idRecepcion;
	private String tipoReserva;
	private int idReserva;
	private int idPersonal;
	private int idHabitacion;
	private int idCliente;
	private Date fIngreso;
	private Date fSalida;
	private Date fRecepcion;
	private int dias;
	private String estado;
	public recepcion() {
		super();
	}
	public recepcion(int idRecepcion, String tipoReserva, int idReserva, int idPersonal, int idHabitacion,
			int idCliente, Date fIngreso, Date fSalida, Date fRecepcion, int dias, String estado) {
		super();
		this.idRecepcion = idRecepcion;
		this.tipoReserva = tipoReserva;
		this.idReserva = idReserva;
		this.idPersonal = idPersonal;
		this.idHabitacion = idHabitacion;
		this.idCliente = idCliente;
		this.fIngreso = fIngreso;
		this.fSalida = fSalida;
		this.fRecepcion = fRecepcion;
		this.dias = dias;
		this.estado = estado;
	}
	public int getIdRecepcion() {
		return idRecepcion;
	}
	public void setIdRecepcion(int idRecepcion) {
		this.idRecepcion = idRecepcion;
	}
	public String getTipoReserva() {
		return tipoReserva;
	}
	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public int getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}
	public int getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getfIngreso() {
		return fIngreso;
	}
	public void setfIngreso(Date fIngreso) {
		this.fIngreso = fIngreso;
	}
	public Date getfSalida() {
		return fSalida;
	}
	public void setfSalida(Date fSalida) {
		this.fSalida = fSalida;
	}
	public Date getfRecepcion() {
		return fRecepcion;
	}
	public void setfRecepcion(Date fRecepcion) {
		this.fRecepcion = fRecepcion;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
