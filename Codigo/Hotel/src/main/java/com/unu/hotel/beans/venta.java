package com.unu.hotel.beans;

public class venta {
	private int idVenta;
	private int idRecepcion;
	private int idAdicional;
	private double subTotal;
	private double precioTotal;
	public venta() {
		super();
	}
	public venta(int idVenta, int idRecepcion, int idAdicional, double subTotal, double precioTotal) {
		super();
		this.idVenta = idVenta;
		this.idRecepcion = idRecepcion;
		this.idAdicional = idAdicional;
		this.subTotal = subTotal;
		this.precioTotal = precioTotal;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getIdRecepcion() {
		return idRecepcion;
	}
	public void setIdRecepcion(int idRecepcion) {
		this.idRecepcion = idRecepcion;
	}
	public int getIdAdicional() {
		return idAdicional;
	}
	public void setIdAdicional(int idAdicional) {
		this.idAdicional = idAdicional;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
}
