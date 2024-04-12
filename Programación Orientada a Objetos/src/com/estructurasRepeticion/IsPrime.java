package com.estructurasRepeticion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isPrime = true;

        System.out.print("Ingresa un numero: ");
        int number = Integer.parseInt(br.readLine());
        
        if (number <= 2) {
            isPrime = false;
        } else {
            for (int i=2; i<=number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }

        br.close();
    }
}
