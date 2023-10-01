package unidad2;

// Leer un número entero de tres digitos y determinar en qué posición está el dígito mayor.

import java.util.Scanner;

public class FPU2Prob16_DFPS {
    public static void main(String[] args) {
        int userNum=0, higherNumIndex=0, digit1=0, digit2=0, digit3=0, numCompare=0;
        int[] numArray = new int[3];
        Scanner scannedUserNum = new Scanner(System.in);

        do {
            System.out.print("Ingresa un número de tres dígitos: ");
            userNum = scannedUserNum.nextInt();
        } while(Math.abs(userNum)<100 || Math.abs(userNum)>999);

        scannedUserNum.close();

        digit1 = (int) userNum/100;
        digit2 = (int) (userNum%100)/10;
        digit3 = userNum%10;
        numArray[0] = digit1; numArray[1] = digit2; numArray[2]=digit3;
        numCompare = numArray[0];

        for (int i=0;i<3;i++) {
            if (numCompare<numArray[i]) {
                higherNumIndex = i;
            }
        }

        System.out.printf("Del número %d, el dígito con mayor valor es el que está en la posición %d.",userNum,higherNumIndex+1);
    }
}
