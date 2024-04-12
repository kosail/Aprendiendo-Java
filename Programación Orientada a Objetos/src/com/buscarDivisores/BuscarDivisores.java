package com.buscarDivisores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BuscarDivisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amountDivisors = 0; 
        
        System.out.print("Ingresa un número: ");
        int x = Integer.parseInt(br.readLine());
        
        for (int i=1; i<=x;i++) {
            if (x%i==0) {
                System.out.print(i + " ");
                amountDivisors++;
            }
        }

        System.out.printf("\nCantidad de dividores: %d\n", amountDivisors);
        br.close();
    }
}
