package com.estructurasCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TipoDeAngulo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa el ángulo en grados: ");
        int angleDegrees = Integer.parseInt(br.readLine());
        String angleType = "";

        if (angleDegrees < 90) {
            angleType = "agudo";
        } else if (angleDegrees > 90 && angleDegrees < 180) {
            angleType = "obtuso";
        } else if (angleDegrees == 90) {
            angleType = "recto";
        } else if (angleDegrees == 180) {
            angleType = "llano";
        } else {
            angleType = "cóncavo";
        }

        System.out.printf("%d° es un ángulo %s.\n", angleDegrees, angleType);
        br.close();
    }
}
