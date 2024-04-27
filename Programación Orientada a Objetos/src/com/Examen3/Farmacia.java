import java.io.*;

public class Farmacia implements Serializable {

	private String nombre ; 
	private double ventasMedicinas;
	private double ventasAbarrotes;
	private double ventasFotografias;
    
    public Farmacia(String n, double vM, double vA, double vF)
    {
    	nombre = n ; 
    	ventasMedicinas = vM ;
    	ventasAbarrotes = vA ; 
    	ventasFotografias = vF;
    }
    public void setNombre(String n)
    {
    	nombre = n ; 
    }
    public void setVentasMedicinas(double vM)
    {
    	ventasMedicinas = vM ; 
    }
    public void setVentasAbarrotes(double vA)
    {
    	ventasAbarrotes = vA ; 
    }
    public void setVentasFotografias(double vF)
    {
    	ventasFotografias = vF;
    }
    public String getNombre()
    {
    	return nombre;
    }
    public double getVentasMedicinas()
    {
    	return ventasMedicinas ; 
    }
    public double getVentasAbarrotes()
    {
    	return ventasAbarrotes;
    }
    public double getVentasFotografias()
    {
    	return ventasFotografias;
    }
    public double calcularVentasTotales()
    {
    	return ventasMedicinas + ventasAbarrotes + ventasFotografias;
    }
    public String toString()
    {
    	return nombre +"\t"+ ventasMedicinas+"\t"+ventasFotografias+"\t"+ventasAbarrotes+"\t"+ventasFotografias;
    }
}