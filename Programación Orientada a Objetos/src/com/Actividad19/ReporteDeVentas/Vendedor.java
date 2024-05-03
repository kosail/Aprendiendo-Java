package com.Actividad19.ReporteDeVentas;

import java.io.Serializable;

public class Vendedor implements Serializable {
	private int numero;
	private String nombre;
	private int departamento;
	private double ventas;

	public Vendedor(int numero, String nombre, int departamento, double ventas) {
		this.numero = numero;
		this.nombre = nombre;
		this.departamento = departamento;
		this.ventas = ventas;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public double getVentas() {
		return ventas;
	}

	public int getDepartamento() {
		return departamento;
	}

	@Override
	public String toString() {
		return String.format("%d\t%s\t%.2f", numero, nombre, ventas);
	}
}
