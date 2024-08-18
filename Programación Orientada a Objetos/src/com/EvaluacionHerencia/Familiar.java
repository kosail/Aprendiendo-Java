
public class Familiar extends Medico
{
    private int consultorio;
    private int pacientes;
    public Familiar(int id, String nom, int con, int pac)
    {
        super(id, nom);
        consultorio = con ; 
        pacientes = pac ; 
    }
    public void setConsultorio(int con)
    {
        consultorio = con;
    }
    public void setPacientes(int pac)
    {
        pacientes = pac ; 
    }
    public int getConsultorio()
    {
        return consultorio;
    }
    public int getPacientes()
    {
        return pacientes;
    }
    public double calcularTiempo()
    {
        return pacientes * 0.5;
    }
    public String toString ()
    {
        return super.toString() + "\t" + consultorio + "\t" + pacientes;
    }
    
}
