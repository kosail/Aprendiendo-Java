package com.Actividad19.CajeroAutomatico;

import java.io.Serializable;

public class Cuenta implements Serializable {
	private int numero;
	private String titular;
	private double saldo;

	public Cuenta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	public void retirar(double saldo) {
		this.saldo -= saldo;
	}
}
