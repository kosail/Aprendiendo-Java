package com.ExamenUnidad2;

 
public class Vendedor {
    private int numero ; 
    private String nombre ; 
    private double ventas ; 
    
    public Vendedor (int num, String nom, double ven)
    {
        numero = num ; 
        nombre = nom; 
        ventas = ven ; 
    }
    public void setNumero(int n)
    {
        numero = n ;
    }
    public void setNombre (String nombre)
    {
        this.nombre = nombre ; 
    }
    public void setVentas (double ven)
    {
        this.ventas = ven ; 
    }
    public int getNumero()
    {
        return numero ; 
    }
    public String getNombre()
    {
        return nombre ; 
    }
    public double getVentas()
    {
        return ventas ; 
    }
    public double calcularComision()
    {
        double comision = ventas * 0.10;
        if (ventas > 1000)
            comision = comision + 100 ;
        else
            if ( ventas >= 500)
                comision = comision + 50 ;
        return comision;
    }
    public String toString()
    {
        return numero + "\t" + nombre + "\t" + ventas ; 
    }
}
