package unidad2;

 // Leer un número entero de dos dígitos y determinar a cuánto es igual la suma de sus dígitos.

import java.util.Scanner;

public class FPU2Prob4_DFPS {
    public static void main(String[] args){ // Creo que ese [] puede ir al lado de string, de args o en medio, según vi en internet
        Scanner sc= new Scanner (System.in);
        int num = 0;
        do{
            System.out.print("Ingresa un entero de 2 digitos\n> ");
            num = sc.nextInt();
        }while(Math.abs(num)<10 || Math.abs(num)>99);
        int dig1 = num / 10;
        int dig2 = num % 10;
        int suma = dig1 + dig2;
        System.out.println("La suma de los dígitos es: " + suma);
        sc.close(); // cerramos el scanner para que el sistema deje de hacer uso del archivo, memoria o dispositivo
    }
}
