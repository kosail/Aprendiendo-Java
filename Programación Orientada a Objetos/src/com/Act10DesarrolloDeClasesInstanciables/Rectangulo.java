package com.Act10DesarrolloDeClasesInstanciables;

public class Rectangulo {
    private double largo, ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }
    
    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return (2 * largo) + (2 * ancho);
    }
    
    public boolean soyCuadrado() {
        return largo == ancho;
    }

    @Override
    public String toString() {
        return "Largo: " + largo +
        "\nAncho: " + ancho;
    }
}