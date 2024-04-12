package com.CircleWorkInClass;


public class Circulo
{
    private double radio ; 
    
    public Circulo(double r)
    {
        radio = r ; 
    }
    public Circulo( ) 
    {
        radio = 1 ; 
    }
    public void setRadio ( double newRadio)
    {
        this.radio = newRadio ;   
    }
    public double getRadio () 
    {
        return radio ; 
    }
    public double calcularCircunferencia()
    {
        return 2 * Math.PI * radio ; 
    }
    public double calcularArea()
    {
        return Math.PI * Math.pow(radio , 2 );
    }
    
}
