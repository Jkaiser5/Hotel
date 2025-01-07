package com.unu.hotel.beans;

import java.sql.Date;

public class reserva {
	private int idReserva;
	private int idHabitacion;
	private int idCliente;
	private Date fIngreso;
	private Date fSalida;
	private Date fReserva;
	private int dias;
	private String estado;
	public reserva() {
		super();
	}
	public reserva(int idReserva, int idHabitacion, int idCliente, Date fIngreso, Date fSalida, Date fReserva, int dias,
			String estado) {
		super();
		this.idReserva = idReserva;
		this.idHabitacion = idHabitacion;
		this.idCliente = idCliente;
		this.fIngreso = fIngreso;
		this.fSalida = fSalida;
		this.fReserva = fReserva;
		this.dias = dias;
		this.estado = estado;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
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
	public Date getfReserva() {
		return fReserva;
	}
	public void setfReserva(Date fReserva) {
		this.fReserva = fReserva;
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
