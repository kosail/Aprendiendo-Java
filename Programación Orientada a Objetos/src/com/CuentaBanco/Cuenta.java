package com.CuentaBanco;

import java.io.Serializable;

public class Cuenta implements Serializable {
    private int numero;
    private String titular;
    private double saldo;

    public Cuenta() {
        numero = 0;
        titular = "NoName";
        saldo = 0;
    }

    public Cuenta(int num, String tit, double sal)
    {
        numero = num;
        titular = tit;
        saldo = sal;
    }

    public void setTitular(String tit) {
        titular = tit;
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

    public void depositar(double cant) {
        saldo += cant;
    }

    public void retirar(double cant) {
        if (cant <= saldo) {
            saldo -= cant;
        } else {
            System.out.println("**Saldo insuficiente**");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String toString() {
        return String.format("Número de cuenta: %d\nTitular: %s\nSaldo: %.2f\n", numero, titular, saldo);
    }
}