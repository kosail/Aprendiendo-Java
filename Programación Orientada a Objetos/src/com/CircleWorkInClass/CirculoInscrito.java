package com.CircleWorkInClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CirculoInscrito {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el lado del cuadrado: ");
        double side = Double.parseDouble(br.readLine());
        Circulo circle = new Circulo(side/2);

        System.out.printf("Circunferencia: %f\nÁrea: %f\n", circle.calcularCircunferencia(), circle.calcularArea());
        br.close();
    }
}
