package com.Act10DesarrolloDeClasesInstanciables;

public class Persona {
    private String nombre;
    private int edad;
    private double peso, altura;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularCalorías() {
        return (peso * 1000 / 452) * 19;
    }

    public double calcularIMC() {
        return peso/(altura*altura);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nPeso: %.2f\nAltura: %.2f\n", nombre, edad, peso, altura);
    }
}