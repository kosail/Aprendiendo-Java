package com.PracticaClasePersona;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre ; 
    private int edad ; 
    private double peso ; 
    private double altura ; 
        
    public Persona(String n , int e, double p , double a) 
    {
        nombre = n ; 
        edad = e ; 
        peso = p ; 
        altura = a ; 
    }
    public void setNombre(String n)
    {
        nombre = n ; 
    }
    public void setEdad(int e)
    {
        edad = e ; 
    }
    public void setPeso(double p)
    {
        peso = p ; 
    }
    public void setAltura(double a)
    {
        altura = a ; 
    }
    public String getNombre()
    {
        return nombre ; 
    }
    public int getEdad()
    {
        return edad ; 
    }
    public double getPeso()
    {
        return peso ; 
    }
    public double getAltura()
    {
        return altura ; 
    }
    public double calcularCalorias()
    {
        return peso * 2.2 * 19 ; 
    }
    public double calcularIMC()
    {
        return peso / ( altura * altura);
    }
    public String toString()
    {
        return nombre + "  " + edad + "  " + peso + "  " + altura ; 
    }    
}