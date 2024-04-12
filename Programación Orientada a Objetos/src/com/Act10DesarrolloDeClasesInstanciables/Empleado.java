package com.Act10DesarrolloDeClasesInstanciables;

public class Empleado {
    private int numero, horasTrabajadas;
    private String nombre;
    private double pagoHora;

    public Empleado(int numero, String nombre, int horasTrabajadas, double pagoHora) {
        this.numero = numero;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoHora() {
        return pagoHora;
    }
    
    public double calcularSalario() {
        return (horasTrabajadas*pagoHora) * 0.9;
    }
    
    @Override
    public String toString() {
        return String.format("Número: %d\nNombre: %s\nHoras trabajadas: %d\nPago por hora: %f\n", numero, nombre, horasTrabajadas, pagoHora);
    }
}