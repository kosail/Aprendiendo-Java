

public class Cirujano extends Medico
{
    private int quirofano;
    private int cirugias;
    public Cirujano(int id, String nom, int q, int c)
    {
        super(id, nom);
        quirofano = q;
        cirugias = c ; 
    }
    public void setQuirofano(int q)
    {
        quirofano = q;
    }
    public void setCirugias(int c)
    {
        cirugias = c ; 
    }
    public int getQuirofano()
    {
        return quirofano;
    }
    public int getCirugias()
    {
        return cirugias;
    }
    public double calcularTiempo()
    {
        return cirugias * 3.5 ;
    }
    public String toString()
    {
        return super.toString() + "\t" + quirofano + "\t"+ cirugias ; 
    }
}
