package com.unu.hotel.beans;

import java.sql.Date;

	public class reserva {
	    private int idReserva;
	    private int idUsuario;
	    private int idPersona;
	    private int idHabitacion;
	    private Date fIngreso;
	    private Date fSalida;
	    private Date fReserva;
	    private int dias;
	    private String estado;

	    // Constructor
	    public reserva() {
	        super();
	    }

	    public reserva(int idReserva, int idUsuario, int idPersona, int idHabitacion, Date fIngreso, Date fSalida, Date fReserva, int dias, String estado) {
	        this.idReserva = idReserva;
	        this.idUsuario = idUsuario;
	        this.idPersona = idPersona;
	        this.idHabitacion = idHabitacion;
	        this.fIngreso = fIngreso;
	        this.fSalida = fSalida;
	        this.fReserva = fReserva;
	        this.dias = dias;
	        this.estado = estado;
	    }

	    // Getters y Setters
	    public int getIdReserva() {
	        return idReserva;
	    }

	    public void setIdReserva(int idReserva) {
	        this.idReserva = idReserva;
	    }

	    public int getIdUsuario() {
	        return idUsuario;
	    }

	    public void setIdUsuario(int idUsuario) {
	        this.idUsuario = idUsuario;
	    }

	    public int getIdPersona() {
	        return idPersona;
	    }

	    public void setIdPersona(int idPersona) {
	        this.idPersona = idPersona;
	    }

	    public int getIdHabitacion() {
	        return idHabitacion;
	    }

	    public void setIdHabitacion(int idHabitacion) {
	        this.idHabitacion = idHabitacion;
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
