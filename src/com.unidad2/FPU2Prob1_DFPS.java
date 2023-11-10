package unidad2;

// Leer un numero entero y determinar si es un numero terminado en 4

import java.util.Scanner;

public class FPU2Prob1_DFPS {
    public static void main(String[] args) {
        byte userNum = 0;
        boolean validationOfNumber = false;
        java.util.Scanner scanUserNum = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        userNum = scanUserNum.nextByte();

        if (userNum%4 == 0) {
            validationOfNumber = true;
        }

        System.out.printf("¿El número %d termina en 4?: %b",userNum,validationOfNumber);
        // printf permite imprimir placeholders que luego podemos reemplazar con otras cosas, así como en C o en Python.
        scanUserNum.close();
    }
}
