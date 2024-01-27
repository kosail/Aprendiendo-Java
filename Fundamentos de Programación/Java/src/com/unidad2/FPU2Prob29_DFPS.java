package unidad2;

// Muestre el nombre del día de la semana que corresponde a un número proporcionado entre 1 y 7 inclusive, asociando el 1 al lunes y así sucesivamente hasta asociar el 7 al domingo.

import java.util.Scanner;

public class FPU2Prob29_DFPS {
    public static void main (String[] args) {
        byte userEntry = 0;
        Scanner scannedUserEntry = new Scanner(System.in);
        do {
            System.out.print("Ingresa un entero entre 1 y 7, inclusive: ");
            userEntry = scannedUserEntry.nextByte();
        } while(userEntry<0 || userEntry>7);
        
        scannedUserEntry.close();

        switch (userEntry) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No ingresaste una opción válida.");
        }
    }
}
