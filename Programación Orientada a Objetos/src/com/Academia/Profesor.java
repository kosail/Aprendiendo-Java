package com.Academia;

public class Profesor {
    private int expediente ; 
    private String nombre ; 
    private double horas ; 
    private int categoria ; 
        
    public Profesor(int cve, String nom, double hr, int cat) 
    {
            expediente = cve ; 
            nombre = nom ; 
            horas = hr; 
            categoria = cat ; 
    }
    public void setExpediente(int e)
    {
        expediente = e ; 
    }
    public void setNombre(String n)
    {
        nombre = n; 
    }
    public void setHoras(double h)
    {
        horas = h; 
    }
    public void setCategoria(int c)
    {
        categoria = c ; 
    }
    public int getExpediente ( )
    {
        return expediente ; 
    }
    public String getNombre (  )
    {
        return nombre ; 
    }
    public double getHoras( )
    {
        return horas ; 
    }
    public int getCategoria ( )
    {
        return categoria ; 
    }
    public double calcularSalario ( )
    {
            double sueldo = 0 ; 
            if (categoria == 1)
                    sueldo = (horas * 80) * 0.86 ; 
            if (categoria == 2)
                    sueldo = (horas  * 120) * 0.85 ; 
            if ( categoria == 3)
                    sueldo = (horas  * 200) * 0.83 ; 
            return sueldo ;             
    }
    public String toString ( )
    {
            return expediente + "\t"+nombre+"\t"+horas+"\t"+categoria ; 
    }
}