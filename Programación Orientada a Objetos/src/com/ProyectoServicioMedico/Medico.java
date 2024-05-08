package com.ProyectoServicioMedico;

import java.io.Serializable;

public class Medico implements Serializable {
	private int cedula;
	private String nombre;

	public Medico (int cedula, String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return String.format("%d\t%s", cedula, nombre);
	}
}
