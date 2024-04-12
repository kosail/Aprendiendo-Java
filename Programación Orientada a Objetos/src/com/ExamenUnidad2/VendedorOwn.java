package com.ExamenUnidad2;

public class VendedorOwn {
    private int numero;
    private String nombre;
    private double ventas;

    // Default constructor
    public VendedorOwn() {
        numero = 0;
        nombre = "";
        ventas = 0;
    }

    public VendedorOwn(int numero, String nombre, double ventas) {
        this.numero = numero;
        this.nombre = nombre;
        this.ventas = ventas;
    }

    // Setters area
    void setNumero(int numero) {
        this.numero = numero;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setVentas(double ventas) {
        this.ventas = ventas;
    }

    // Getters area
    int getNumero() {
        return numero;
    }

    String getNombre() {
        return nombre;
    }

    double getVentas() {
        return ventas;
    }

    double calcularComision() {
        double commissions = ventas * 0.10;

        if (ventas > 1000) {
            commissions += 100;
        } else if (ventas <= 1000 && ventas >= 500) {
            commissions += 50;
        }

        return commissions;
    }

    // Overrides default toString function. Setting a public scope due to the fact that I cannot reduce the scope of the default toString function.
    @Override
    public String toString() {
        return String.format("Datos del Vendedor:\n\tNombre: %s\n\tNúmero: %d\n\tVentas: %.2f\n\tComisión: %.2f\n", nombre, numero, ventas, calcularComision());
    }
}
