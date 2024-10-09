package com.korealm.Examen1;

public class Cono {
    private float radio = 0;
    private float altura = 0;
    
    public Cono() {}
    
    public Cono(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    public float getRadio() {
        return radio;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float areaBase() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
    
    public float volumen() {
        return (float) ((Math.PI * Math.pow(radio, 2)) * altura)/3;
    }
    
    @Override
    public String toString() {
        return "Radio = " + radio +
                ", Altura =" + altura +
                ", Area = " + areaBase() +
                ", Volumen = " + volumen();
    }
}
