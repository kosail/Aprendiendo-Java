package com.korealm;
/**
 * Clase instanciable para manejar objetos: 
 * 
 * ==== prisma trapezoidales  =======
 * 
 */

public class PrismaTrapezoidal
{
    // atributos
    private float baseMayor;
    private float baseMenor;
    private float alturaTrapecio;
    private float ladoTrapecio;
    private float alturaPrisma;
    
    // 1er. Constructor
    public PrismaTrapezoidal ()
    {
        baseMayor = baseMenor = alturaTrapecio = ladoTrapecio = alturaPrisma = 0;
    }
    
    // 2do. Constructor
    public PrismaTrapezoidal (float baseMayor,float baseMenor,float alturaTrapecio,float ladoTrapecio,float alturaPrisma)
    {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.alturaTrapecio = alturaTrapecio;
        this.ladoTrapecio = ladoTrapecio;
        this.alturaPrisma = alturaPrisma;
    }
    
    // getters
    public float getBaseMayor (){
        return baseMayor;
    }   
    
    public float getBaseMenor (){
        return baseMenor;
    }  
    
    public float getAlturaTrapecio (){
        return alturaTrapecio;
    }   
    
    public float getLadoTrapecio (){
        return ladoTrapecio;
    }
    
    public float getAlturaPrisma (){
        return alturaPrisma;
    }
    
    // setters
    public void setBaseMayor (float baseMayor){
        this.baseMayor = baseMayor;
    }
    
    public void setBaseMenor (float baseMenor){
        this.baseMenor = baseMenor;
    }
    
    public void setAlturaTrapecio (float alturaTrapecio){
        this.alturaTrapecio = alturaTrapecio;
    }
    
    public void setLadoTrapecio (float ladoTrapecio){
        this.ladoTrapecio = ladoTrapecio;
    }
    
    public void seAlturaPrisma (float alturaPrisma){
        this.alturaPrisma = alturaPrisma;
    }
    
    
    // toString
    public String toString () {
        return "BaseMayor: "+baseMayor+
        "\nBaseMenor: "+baseMenor+
        "\nAlturaTrapecio: "+alturaTrapecio+
        "\nLadoTrapecio: "+ladoTrapecio+
        "\nAlturaPrisma: "+alturaPrisma;
    }
    
    //calcular volumen del prisma
    public float calcularVolumen() {
//        return (( + ) * ) /
return 0;
    }
    
    
    // calcular área del prism
    public float calcularArea() {
       return 0;  // falta implementar la fórmula para el cálculo
    }
    
    
}
