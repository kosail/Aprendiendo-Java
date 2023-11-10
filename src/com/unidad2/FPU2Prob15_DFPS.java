package unidad2;

// Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.

import java.util.Scanner;

public class FPU2Prob15_DFPS {
    public static void main(String[] args) {
        int userNum=0, digitOne=0, digitTwo=0, digitThree=0;
        Scanner scannedUserNum =  new Scanner(System.in);

        do {
            System.out.print("Ingresa un número de tres dígitos: ");
            userNum = scannedUserNum.nextInt();
        } while(Math.abs(userNum)<100 || Math.abs(userNum)>999);

        scannedUserNum.close();
        digitOne = (int) userNum/100;
        digitTwo = (int) (userNum%100)/10;
        digitThree = userNum%10;

        System.out.println("+-------------------------------+");
        System.out.printf("La suma de todos los dígitos es de %d.", digitOne+digitTwo+digitThree);
    }
}
