

public class Medico
{
    protected int id ;
    protected String nombre ; 
    public Medico(int i, String nom)
    {
        id = i ; 
        nombre = nom ; 
    }
    public void setId(int i)
    {
        id = i;
    }
    public void setNombre(String nom)
    {
        nombre = nom ; 
    }
    public int getId()
    {
        return id;
    }
    public String getNombre()
    {
        return nombre ; 
    }
    public double calcularTiempo()
    {
        return 0;
    }
    public String toString()
    {
        return id + "\t" + nombre ; 
    }
}
