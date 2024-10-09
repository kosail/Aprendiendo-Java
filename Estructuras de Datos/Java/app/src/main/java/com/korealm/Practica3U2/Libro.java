package com.korealm.Practica3U2;

public class Libro {
    private String titulo;
    private String autor;
    private float precio;
    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.precio = 0;
    }
    
    public Libro(String titulo, String autor, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return String.format("Libro {\n\tTitulo: %s\n\tAutor: %s\n\tPrecio: %.2f\n}", titulo, autor, precio);
    }
}
