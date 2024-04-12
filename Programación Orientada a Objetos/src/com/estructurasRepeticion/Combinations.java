package com.estructurasRepeticion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combinations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int factorialN = 1;
        int factorialR = 1;
        int factorialNR = 1;

        for (int i=n; i>=1; i--) {
            factorialN *=i ;
        }

        for (int i=r; i>=1; i--) {
            factorialR *=i ;
        }

        for (int i=(n - r); i>=1; i--) {
            factorialNR *=i ;
        }

        System.out.println((factorialN)/(factorialNR * factorialR));
        br.close();
    }
}
