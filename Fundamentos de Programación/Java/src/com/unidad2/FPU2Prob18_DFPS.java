package unidad2;

// Leer tres numeros enteros y determinar cuál es el mayor. Usar solamente dos variables

import java.util.Scanner;

public class FPU2Prob18_DFPS {
    public static void main(String[] args) {
        int num1=0, num2=0;
        Scanner scannedNumbers = new Scanner(System.in);

        System.out.print("Ingresa el primer número de tres dígitos: ");
        num1 = scannedNumbers.nextInt();
        System.out.print("Ingresa el segundo número de tres dígitos: ");
        num2 = scannedNumbers.nextInt();
        System.out.print("Ingresa el tercer número de tres dígitos: ");

        if (num1>num2) {
            num2 = scannedNumbers.nextInt();
        } else {
            num1 = scannedNumbers.nextInt();
        }

        scannedNumbers.close();
        if (num1>num2) {
            System.out.printf("El número mayor es %d",num1);
        } else {
            System.out.printf("El número mayor es %d", num2);
        }
    }
}
