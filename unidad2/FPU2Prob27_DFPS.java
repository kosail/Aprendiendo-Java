package unidad2;

//Muestre el nombre del mes que corresponde a un número proporcionado entre 1 y 12 inclusive, asociando el 1 a enero, el 2 a febrero y así sucesivamente hasta asociar el 12 a diciembre.

import java.util.Scanner;

public class FPU2Prob27_DFPS {
    public static void main (String[] args) {
        byte userEntry = 0;
        Scanner scannedUserEntry = new Scanner(System.in);
        do {
            System.out.print("Ingresa un entero entre 1 y 12, inclusive: ");
            userEntry = scannedUserEntry.nextByte();
        } while(userEntry<0 || userEntry>12);
        
        scannedUserEntry.close();

        switch (userEntry) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No ingresaste una opción válida.");
        }
    }
}
