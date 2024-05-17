package com.Ejercicio3Herencia.EjercicioCuenta;

public class Cuenta {
	private String numero;
	private String titular;
	private double saldo;
	private double saldoPromedio;

	public Cuenta(String numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getSaldoPromedio() {
		return saldoPromedio;
	}

	public void depositar(double cantidad) {
		saldo += cantidad;
	}

	public void retirar(double cantidad) {
		saldo -= cantidad;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s", numero, titular);
	}
}
