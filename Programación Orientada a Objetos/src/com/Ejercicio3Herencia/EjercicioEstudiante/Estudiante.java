package com.Ejercicio3Herencia.EjercicioEstudiante;

public class Estudiante {
	private int matricula;
	private String nombre;
	private int[] calificaciones;

	public Estudiante(final int matricula, final String nombre) {
		this.matricula = matricula;
		this.nombre = nombre;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCalificaciones(int[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public int[] getCalificaciones() {
		return calificaciones;
	}

	@Override
	public String toString() {
		return String.format("%d\t%s", matricula, nombre);
	}

}
