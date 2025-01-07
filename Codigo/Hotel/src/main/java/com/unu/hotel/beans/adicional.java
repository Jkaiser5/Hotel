package com.unu.hotel.beans;

public class adicional {
	private int idAdicional;
	private int idCliente;
	private int idHabitacion;
	private int idProducto;
	private int cantidad;
	private double subTotal;
	public adicional() {
		super();
	}
	public adicional(int idAdicional, int idCliente, int idHabitacion, int idProducto, int cantidad, double subTotal) {
		super();
		this.idAdicional = idAdicional;
		this.idCliente = idCliente;
		this.idHabitacion = idHabitacion;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}
	public int getIdAdicional() {
		return idAdicional;
	}
	public void setIdAdicional(int idAdicional) {
		this.idAdicional = idAdicional;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
}
