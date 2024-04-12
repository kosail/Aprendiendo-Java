package com.estructurasRepeticion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoteDeFlechas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el tamaño del lote: ");
        int batchSize = Integer.parseInt(br.readLine());
        int failedArrows = 0;

        for (int i=0; i<batchSize; i++) {
            System.out.printf("Ingresa diametro de flecha %d en mm: ", i + 1);
            
            if (Integer.parseInt(br.readLine()) < 25) {
                failedArrows++;
            }
        }

        if (failedArrows > (batchSize*0.20)) {
            System.out.println("LOTE RECHAZADO");
        } else {
            System.out.println("LOTE ACEPTADO");
        }

        br.close();
    }
    
}
