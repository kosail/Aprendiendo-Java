package com.Actividad16;

public class Estudiante {
    private int matricula = 0;
    private String nombre = "";
    private String carrera = "";
    private double[] calificaciones = null;

    public Estudiante(int matricula, String nombre, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setCalificacion(double calificacion, int position) {
        this.calificaciones[position] = calificacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public double getCalificacion(int position) {
        return calificaciones[position];
    }

    public double calcularPromedio() {
        double total = 0;

        for (double grade : calificaciones) {
            total += grade;
        }

        return total/calificaciones.length;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %d\nNombre: %s\nCarrera: %s\n", matricula, nombre, carrera);
    }
}
