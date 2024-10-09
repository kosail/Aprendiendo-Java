package com.korealm.U2Practica4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class U2Practica4 {
    private static final int LETTERS=0, NUMBERS=1, SYMBOLS=2;
    
    static void readString(BufferedReader br, PilaChar[] stack) throws IOException {
        System.out.print("Ingresa una oración: ");
        final String raw = br.readLine()
                .replaceAll("\\s", "")
                .chars().mapToObj(c -> (char) c) // Convert int to char, because the chars() function returns an IntStream and thus would be... hard, to collect it back.
                .collect(Collectors.toCollection(LinkedHashSet::new)).stream() // Let's take advantage of sets as they natively remove duplicates (using LinkedHashSet because if don't, the original order of the chars will be lost), and let's return to streams after that.
                .map(String::valueOf) // Convert each char to a string (unfortunately, even tho I know this is not the most "optimized" way of proceeding, the joining() method from Collectors requires Strings to return a String.
                .collect(Collectors.joining());
        
        // Initializing the three PilaChar objects after knowing that we could successfully read an entry from the user.
        for (int i = 0; i < stack.length; i++) {
            stack[i] = new PilaChar(raw.length());
        }
        
        
        for (char c : raw.toCharArray()) {
            if (Character.isLetter(c)) {
                stack[LETTERS].push(c);
            } else if (Character.isDigit(c)) {
                stack[NUMBERS].push(c);
            } else {
                stack[SYMBOLS].push(c);
            }
        }
    }
    
    static void printPilaChar(PilaChar stack, String type) {
        if (Objects.isNull(stack) || stack.isEmpty()) {
            System.err.printf("El stack de %s no tiene nada guardado.\n\n", type);
            return;
        }
        
        System.out.printf("Elementos en la pila de %s:\n%s", type, stack);
        System.out.printf("\nNúmero de elementos registrados: %d\n\n", stack.size());
    }
    
    static void printMenu() {
        System.out.println("+-- Práctica 4 --+");
        System.out.println("\t1. Leer un enunciado");
        System.out.println("\t2. Mostrar pila de letras");
        System.out.println("\t3. Mostrar pila de dígitos");
        System.out.println("\t4. Mostrar pila de signos");
        System.out.println("\t5. Salir");
        System.out.print(">> ");
    }
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        
        
        // For easiness of handling between methods (and sacrificing code readiness, I know) I chose to create an array of PilaChar objects.
        // These are the positions:
            // Position 0: letters
            // Position 1: digits
            // Position 2: symbols
        // We are using final int values to map it to a human-readable way.
        PilaChar[] stack = new PilaChar[3];
        
        do {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                switch (option) {
                    case 1 -> readString(br, stack);
                    case 2 -> printPilaChar(stack[LETTERS], "letras");
                    case 3 -> printPilaChar(stack[NUMBERS], "dígitos");
                    case 4 -> printPilaChar(stack[SYMBOLS], "signos");
                    case 5 -> System.out.println("Devolviendo chars a sus orígenes...\nCompletado.");
                }
                
            } catch (IOException e) {
                System.err.println("Ha ocurrido un error en la lectura/escritura.\n Error de tipo: " + e.getClass().getSimpleName());
                
            } catch (NumberFormatException e) {
                System.err.println("Ha ocurrido un error con los datos ingresados.\n Error de tipo: " + e.getClass().getSimpleName());
            }
        
        } while(option != 5);
        
        
    }
}
