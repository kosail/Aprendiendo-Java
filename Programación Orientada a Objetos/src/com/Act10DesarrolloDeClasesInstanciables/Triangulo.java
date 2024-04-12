package com.Act10DesarrolloDeClasesInstanciables;

public class Triangulo {
    private double ladoA, ladoB, ladoC;
    
    public Triangulo(double a, double b, double c) {
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    public void setLadoA(double a) {
        ladoA = a;
    }

    public void setLadoB(double b) {
        ladoB = b;
    }

    public void setLadoC(double c) {
        ladoC = c;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC)/2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    public double calcularPerímetro() {
        return (ladoA + ladoB + ladoC);
    }

    public boolean soyTriangulo() {
        return ((ladoA + ladoB) > ladoC & (ladoB + ladoC) > ladoA & (ladoC + ladoA) > ladoB);
    }

    public String tipoTriangulo() {
        return
        (ladoA == ladoB) && (ladoB == ladoC) ? "Equilatero":
        (ladoA == ladoB)||(ladoA == ladoB)||(ladoB == ladoC) ? "Isóseles":"Escaleno";
    }

    @Override
    public String toString() {
        return "Lado A: " + ladoA +
        "\nLado B: " + ladoB +
        "\nLado C: " + ladoC;}
}