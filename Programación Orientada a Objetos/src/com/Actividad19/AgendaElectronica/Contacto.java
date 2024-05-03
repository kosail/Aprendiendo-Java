package com.Actividad19.AgendaElectronica;

import java.io.Serializable;

public class Contacto implements Serializable {
	private String nombre;
	private int telefono;
	private String direccion;
	private int fechaCumpleaños;

	public Contacto(String nombre, int telefono, String direccion, int fechaCumpleaños) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fechaCumpleaños = fechaCumpleaños;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setFechaCumpleaños(int fechaCumpleaños) {
		this.fechaCumpleaños = fechaCumpleaños;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getFechaCumpleaños() {
		return fechaCumpleaños;
	}

	@Override
	public String toString() {
		return String.format("%s\t%d\t%s\t%d/%d",
		nombre, telefono, direccion,
		fechaCumpleaños/100,
		fechaCumpleaños%100
		);
	}
}
