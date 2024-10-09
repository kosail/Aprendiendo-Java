package com.korealm.U2Practica5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class U2Practica5 {
    
    static void readNumber(BufferedReader br, DoblePilaInt stack) throws IOException, NumberFormatException {
        System.out.print("Ingresa un número: ");
        final int input = Integer.parseInt(br.readLine());
        
        if ((input % 2) == 0 ) {
            stack.pushPila1(input);
        } else {
            stack.pushPila2(input);
        }
    }
    
    static void printEvenNumbers(DoblePilaInt stack) {
        if (stack.isEmptyPila1()) {
            System.err.println("\nNo hay números pares registrados.\n");
            return;
        }
        
        System.out.println(stack.toStringPila1());
        System.out.printf("No. Elementos: %d\n\n", stack.sizePila1());
    }
    
    static void printOddNumbers(DoblePilaInt stack) {
        if (stack.isEmptyPila2()) {
            System.err.println("\nNo hay números impares registrados.\n");
            return;
        }
        
        System.out.println(stack.toStringPila2());
        System.out.printf("No. Elementos: %d\n\n", stack.sizePila2());
    }
    
    static void popEvenNumbers(DoblePilaInt stack) {
        if (stack.isEmptyPila1()) {
            System.err.println("No hay números pares para retirar");
            return;
        }
        
        System.out.println(stack.popPila1());
    }
    
    static void popOddNumbers(DoblePilaInt stack) {
        if (stack.isEmptyPila2()) {
            System.err.println("No hay números impares para retirar");
            return;
        }
        
        System.out.println(stack.popPila2());
    }
    
    static void printMenu() {
        System.out.println("+-- Doble Pila de Enteros --+");
        System.out.println("\t1. Insertar número");
        System.out.println("\t2. Mostrar pila de pares");
        System.out.println("\t3. Mostrar pila de impares");
        System.out.println("\t4. Eliminar un par");
        System.out.println("\t5. Eliminar un impar");
        System.out.println("\t6. Salir");
        System.out.print(">> ");
    }
    
    public static void main(String[] args) {
        final DoblePilaInt stack = new DoblePilaInt(50);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        
        do {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                switch (option) {
                    case 1 -> readNumber(br, stack);
                    case 2 -> printEvenNumbers(stack);
                    case 3 -> printOddNumbers(stack);
                    case 4 -> popEvenNumbers(stack);
                    case 5 -> popOddNumbers(stack);
                    case 6 -> System.out.println("Destruyendo pilas...\nCompletado");
                }
            
            } catch (IOException e) {
                System.err.println("Ha ocurrido un error en la lectura/escritura.\n Error de tipo: " + e.getClass().getSimpleName());
                
            } catch (NumberFormatException e) {
                System.err.println("Ha ocurrido un error con los datos ingresados.\n Error de tipo: " + e.getClass().getSimpleName());
            }
            
        } while(option != 6);
        
    }
}
