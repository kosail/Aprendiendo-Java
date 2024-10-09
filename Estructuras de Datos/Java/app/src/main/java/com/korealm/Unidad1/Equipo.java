package com.korealm.Unidad1;

class Equipo {
	private String nombre = "";
	private char division = ' ';
	private int numJugadores = 0;
	private int puntos = 0;
	private boolean clasifica = false;

	public Equipo() {}

	public Equipo (String nombre, char division, int numJugadores, int puntos) {
		this.nombre = nombre;
		this.division = division;
		this.numJugadores = numJugadores;
		this.puntos = puntos;
		this.clasifica = puntos >= 15 ? true : false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public boolean getClasifica() {
		return clasifica;
	}

	public void setClasifica(boolean clasifica) {
		this.clasifica = clasifica;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", division=" + division + ", numJugadores=" + numJugadores + ", puntos="
				+ puntos + ", clasifica=" + clasifica + "]";
	}


	
}