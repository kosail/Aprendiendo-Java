package com.estructurasCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CostoTerreno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] landPlots = new int[3];
        int squaredMetersSize, finalPrice;

        System.out.println("Ingresa el largo, luego el ancho y luego el precio por metro cuadrado:");
        for (int i=0; i<landPlots.length; i++) {
            System.out.print(">> ");
            landPlots[i] = Integer.parseInt(br.readLine());
        }

        squaredMetersSize = landPlots[0]*landPlots[1];

        if (squaredMetersSize<400) {
            finalPrice = squaredMetersSize * landPlots[2];
        } else {
            if (squaredMetersSize < 500) {
                finalPrice = (int) ((squaredMetersSize * landPlots[2]) * 0.90);
            } else {
                if (squaredMetersSize < 1000) {
                    finalPrice = (int) ((squaredMetersSize * landPlots[2]) * 0.83);
                } else {
                    finalPrice = (int) ((squaredMetersSize * landPlots[2]) * 0.75);
                }
            }
        }

        System.out.printf("Precio final por %d metros cuadrados: %d\n", squaredMetersSize, finalPrice);
        br.close();
    }
}
