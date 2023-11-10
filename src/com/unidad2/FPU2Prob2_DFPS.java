package unidad2;

// Leer un numero entero y determinar si tiene 3 digitos.
 

import java.util.Scanner;

public class FPU2Prob2_DFPS {
    public static void main(String[] args) {
        short userNum = 0; // Usamos un short en vez de un byte porque el byte llega hasta los 127 números, y en este algoritmo lo que intentamos es calcular números de tres cifras, lo que excede en sobremanera a un byte. Referir a la tabla en tipos de datos en Java en Notion 
        boolean validationOfNumber = false;
        Scanner scannedUserNum = new Scanner (System.in);

        System.out.print("Ingresa un número: ");
        userNum = scannedUserNum.nextShort();

        if (userNum>=100 && userNum<=999 || userNum>=-999 && userNum<=-100) {
            validationOfNumber = true;
        }

        System.out.printf("¿el número %d tiene 3 dígitos?: %b",userNum,validationOfNumber);
        scannedUserNum.close();
    }
}
