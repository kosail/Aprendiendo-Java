package com.estructurasRepeticion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuntoDeVenta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lastArticleCode = 0; 
        int totalSales = 0;
        double totalAmount = 0;

        do {
            System.out.print("Ingresa el código del artículo: ");
            lastArticleCode = Integer.parseInt(br.readLine());
            totalSales++;
            System.out.print("Ingresa el precio de venta: ");
            totalAmount += Integer.parseInt(br.readLine());
        } while(lastArticleCode>0);

        System.out.printf("Total articulos vendidos: %d\nTotal ganancias: %.2f",totalSales, totalAmount);
        br.close();
    }
}
