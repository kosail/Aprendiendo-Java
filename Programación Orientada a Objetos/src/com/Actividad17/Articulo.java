package com.Actividad17;

public class Articulo {
    private int clave;
    private String descripcion;
    private int existencia;
    private double costo;

    public Articulo(int clave, String descripcion, int existencia, double costo) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.costo = costo;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public double getCosto() {
        return costo;
    }

    public double calcularValorInventario() {
        return existencia*costo;
    }

    @Override
    public String toString() {
        return String.format("Clave: %d\nDescripción: %s\nExistencia: %d\nCosto por unidad: %.2f\n Valor de inventario: %.2f", clave, descripcion, existencia, costo, calcularValorInventario());
    }
}
