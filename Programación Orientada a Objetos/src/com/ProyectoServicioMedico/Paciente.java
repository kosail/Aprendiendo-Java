package com.ProyectoServicioMedico;

import java.io.Serializable;

public class Paciente implements Serializable{
    //atributos
    private int expediente, edad;
    private String nombre, celular;
    private double peso, altura;

    //constructor
    public Paciente(int exp, String nom, String cel, int ed, double pe, double al){
        expediente = exp;
        nombre = nom;
        celular = cel;
        edad = ed;
        peso = pe;
        altura = al;}

    //set
    public void setExpediente(int e){
        expediente = e;}
    public void setNombre(String n){
        nombre = n;}
    public void setCelular(String c){
        celular = c;}
    public void setEdad(int e){
        edad = e;}
    public void setPeso(double p){
        peso = p;}
    public void setAltura(double a){
        altura = a;}
    
    //get
    public int getExpediente(){
        return expediente;}
    public String getNombre(){
        return nombre;}
    public String getCelular(){
        return celular;    }
    public int getEdad(){
        return edad;}
    public double getPeso(){
        return peso;}
    public double getAltura(){
        return altura;}
    
    //Cálculos
    public double calcularIMC(){
        return peso/(altura*altura);}

    //obtener datos
    public String toString(){
        return expediente + "\t" + nombre + "\t" + celular + "\t" + edad + "\t" + peso + "\t" + altura;}
}
