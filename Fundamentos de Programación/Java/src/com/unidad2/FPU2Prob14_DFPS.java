package unidad2;

// Leer dos números enteros de dos digitos y determinar a cuánto es igual la suma de todos los dígitos.

import java.util.Scanner;

public class FPU2Prob14_DFPS {
    public static void main(String[] args) {
        int userNum1=0, userNum2=0, digit1_1=0, digit1_2=0, digit2_1=0, digit2_2=0;
        Scanner scannedUserInput = new Scanner(System.in);

        do {
            System.out.print("Ingresa un primer número con dos dígitos: ");
            userNum1 = scannedUserInput.nextInt();
        } while(Math.abs(userNum1)<10 || Math.abs(userNum1)>99);
        
        do {
            System.out.print("Ingresa un segundo número de dos dígitos: ");
            userNum2 = scannedUserInput.nextInt();
        } while(Math.abs(userNum2)<10 || Math.abs(userNum2)>99);

        scannedUserInput.close();
        digit1_1 = (int) userNum1/10;
        digit2_1 = (int) userNum2%10;
        digit1_2 = userNum1%10;
        digit2_2 = userNum2%10;

        System.out.println("+-------------------------------+");
        System.out.printf("La suma de todos los dígitos es: %d",digit1_1+digit1_2+digit2_1+digit2_2);
    }    
}
