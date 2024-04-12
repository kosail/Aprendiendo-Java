package com.Estudiante;

public class Estudiante {
    int number;
    String name = "", degree = "";

    public Estudiante(int number, String name, String degree) {
        this.number = number;
        this.name = name;
        this.degree = degree;
    }

    public int getStudentNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public void setStudentNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
}
