package com.Ejercicio3Herencia.EjercicioCuenta;

public class CuentaDebito extends Cuenta {
	private double saldoMinimo;

	public CuentaDebito(String numero, String titular, double saldoMinimo) {
		super(numero, titular);
		this.saldoMinimo = saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	@Override
	public void depositar(double cantidad) {
		super.depositar(cantidad);
	}

	@Override
	public void retirar(double cantidad) {
		if (this.getSaldo() - cantidad < saldoMinimo) {
			cantidad +=100;
		}
		if (cantidad <= this.getSaldo()) {
			super.retirar(cantidad);
		}
	}

	@Override
	public String toString() {
		return String.format("%s\t%.2f", super.toString(), this.saldoMinimo);
	}
}
