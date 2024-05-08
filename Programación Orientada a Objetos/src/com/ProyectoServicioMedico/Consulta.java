package com.ProyectoServicioMedico;

import java.io.Serializable;

public class Consulta implements Serializable {
	private Paciente paciente;
	private Medico medico;
	private int mes;
	private int dia;
	private int hora;

	public Consulta(Paciente paciente, Medico medico, int mes, int dia, int hora) {
		this.paciente = paciente;
		this.medico = medico;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public int getHora() {
		return hora;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%d/%d/t%d", paciente.getNombre(), medico.getNombre(), mes, dia, hora);
	}
}
