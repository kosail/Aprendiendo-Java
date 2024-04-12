package com.estructurasCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelGuamuchil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        System.out.print("Ingresa la cantidad de días: ");
        int days = Integer.parseInt(br.readLine());
        System.out.print("Ingresa el precio por noche: ");
        int pricePerNight = Integer.parseInt(br.readLine());

        if (days < 5) {
            total = days*pricePerNight;
        } else {
            if (days < 15) {
                total = days * ( (int) (pricePerNight * 0.90));
            } else {
                total = days * ( (int) (pricePerNight * 0.85));
            }
        }
        
        System.out.printf("Total: %d\n", total);
        br.close();
    }
}
