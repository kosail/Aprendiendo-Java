package com.GeneradorTerrenosDeTexto;

import java.io.* ; 
public class Terreno implements Serializable
{
    private double fondo; 
    private double frente;
    private String ubicacion;
    private double precioM2;
    
    public Terreno(double fo, double fr, String ub, double pr)
    {
        fondo = fo;
        frente = fr;
        ubicacion = ub;
        precioM2 = pr;
    }
    public void setFondo(double f)
    {
        fondo = f ; 
    }
    public void setFrente(double f)
    {
        frente = f;
    }
    public void setUbicacion(String u)
    {
        ubicacion = u;
    }
    public void setprecioM2(double p)
    {
        precioM2 = p;
    }
    public double getFondo()
    {
        return fondo;
    }
    public double getFrente()
    {
        return frente;
    }
    public String getUbicacion()
    {
        return ubicacion;
    }
    public double getPrecioM2()
    {
        return precioM2;
    }
    public double calcularValorTerreno()
    {
        double valor = fondo * frente * precioM2;
        if (frente > 15)
            valor = valor + 25000;
        else
            if (frente > 10)
                valor = valor + 10000;
        return valor ; 
    }
    public String toString()
    {
        return fondo + "\t" + frente + "\t" + ubicacion + "\t" + precioM2;
    }
}
