package com.Ejercicio3Herencia.EjercicioEstudiante;

import java.util.Arrays;

public class EstudianteGraduado extends Estudiante {

	public EstudianteGraduado(final int matricula, final String nombre) {
		super(matricula, nombre);
	}

	public String calcularResultado() {
		double promedioFinal = Arrays.stream(this.getCalificaciones()).average().orElse(0);

		if (promedioFinal >= 85) {
			return "Aprobado";
		}

		return "Reprobado";
	}
}
