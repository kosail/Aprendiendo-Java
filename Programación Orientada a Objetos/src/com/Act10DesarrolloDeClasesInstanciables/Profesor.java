package com.Act10DesarrolloDeClasesInstanciables;

public class Profesor {
    private int expediente, categoria;
    private String nombre;
    private double horas;

    public Profesor(int expediente, String nombre, double horas, int categoria) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.horas = horas;
        this.categoria = categoria;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getExpediente() {
        return expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHoras() {
        return horas;
    }

    public int getCategoria() {
        return categoria;
    }

    public double calcularSalario() {
        return
        (categoria == 1) ? (horas * 80) :
        (categoria == 2) ? (horas * 120) : (categoria == 3) ? (horas * 200) : 0;
    }

    @Override
    public String toString() {
        return String.format("Expediente: %d\nNombre: %s\nCantidad de horas: %.2f\nCategoría: %d\n", expediente, nombre, horas, categoria);
    }
}