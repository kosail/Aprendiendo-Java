package com.estructurasRepeticion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa un número: ");
        int limit = Integer.parseInt(br.readLine());
        
        for (int i=2; i<limit;i++) {
            boolean isPrime = true;
            
            for (int j=2; j<Math.sqrt(i);j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        br.close();
    }
}
