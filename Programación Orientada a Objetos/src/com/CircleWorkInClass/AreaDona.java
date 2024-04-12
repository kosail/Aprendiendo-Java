package com.CircleWorkInClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaDona {
    public static void main(String[] args) throws IOException {
        Circulo circle1, circle2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el radio menor: ");
        circle1 = new Circulo(Double.parseDouble(br.readLine()));
        System.out.print("Ingresa el radio mayor: ");
        circle2 = new Circulo(Double.parseDouble(br.readLine()));

        System.out.printf("El área buscada es: %f\n", circle2.calcularArea() - circle1.calcularArea());

        br.close();
    }
}
