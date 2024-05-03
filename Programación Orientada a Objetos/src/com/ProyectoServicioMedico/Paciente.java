package com.ProyectoServicioMedico;

import java.io.Serializable;

public class Paciente implements Serializable  {
	private int expediente;
	private String nombre;
	private String celular;
	private int edad;
	private double peso;
	private double altura;

	public Paciente (int expediente, String nombre, String celular, int edad, double peso, double altura) {
		this.expediente = expediente;
		this.nombre = nombre;
		this.celular = celular;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getExpediente() {
		return expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCelular() {
		return celular;
	}

	public int getEdad() {
		return edad;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double calcularIMC() {
		return peso/(altura*altura);
	}

	@Override
	public String toString() {
		return String.format("%d\t%s\t%s\t%d\t%.2f\t%.2f", expediente, nombre, celular, edad, peso, altura);
	}
}
