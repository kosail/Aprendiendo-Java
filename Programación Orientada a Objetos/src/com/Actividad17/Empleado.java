package com.Actividad17;

public class Empleado {
    private int numero = 0;
    private String nombre  = "";
    private double sueldo = 0;

    public Empleado(int numero, String nombre, double sueldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    int getNumero() {
        return numero;
    }

    String getNombre() {
        return nombre;
    }

    double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return String.format("No. %d\nNombre: %s\nSueldo: %.2f",numero, nombre, sueldo);
    }
}
