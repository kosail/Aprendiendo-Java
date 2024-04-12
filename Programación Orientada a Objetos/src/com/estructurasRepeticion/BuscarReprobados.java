package com.estructurasRepeticion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuscarReprobados {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int failCounter = 0;

        System.out.print("Ingresa la cantidad de calificaciones que quieres evaluar: ");
        int limit = Integer.parseInt(br.readLine());
        
        for (int i=0; i<limit; i++) {
            System.out.print("Ingresa la nota: ");
            if (Integer.parseInt(br.readLine()) < 70) {
                failCounter++;
            }
        }

        System.out.printf("Total de reprobados: %s\n", failCounter);
        br.close();
    }
}
