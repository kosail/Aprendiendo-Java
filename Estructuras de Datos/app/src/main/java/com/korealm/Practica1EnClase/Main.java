package com.korealm.Practica1EnClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    
    static void printMenu() {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║         Unidad 1: Matrices        ║");
        System.out.println("║═══════════════════════════════════║");
        System.out.println("║            1. Matriz A            ║");
        System.out.println("║            2. Matriz B            ║");
        System.out.println("║            3. Terminar            ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.print("\n>> ");
    }
    
    static void matrixA(int n) {
//        int[][] matriz = new int[n][n];
//        int inicio = 0, fin = n, num = 1;
//        boolean arriba = true;
//        while(fin != inicio) {
//            if (arriba) {
//                for (int i = 0; i < n; i++) {
//                    matriz[inicio][i] = num++;
//                }
//                inicio ++;
//            } else {
//                for (int i = 0; i < n; i++) {
//                    matriz[fin][i] = num++;
//                }
//                fin ++;
//            }
//            arriba = !arriba;
//        }
    }
    
    static void matrixB(int n) {
        int[][] matrix = new int[n][n];
        int filler = 0;
        
        for (int i=0; i < n; i++) {
            Arrays.fill(matrix[i], 0);
            
            for (int j=i; j < n; j++) {
                matrix[i][j] = ++filler;
            }
        }
        
        printArray(matrix);
    }
    
    static void printArray(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        
        while(true) {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                if (option == 3) break;
                
                System.out.print(">> Ingresa n: ");
                int n = Integer.parseInt(br.readLine());
                
                switch (option) {
                    case 1 -> matrixA(n);
                    case 2 -> matrixB(n);
                }
                
            } catch (IOException | NumberFormatException e) {
                System.err.println("Ha ocurrido un error procesando la información. Por favor, revisa la entrada y vuelve a intentarlo de nuevo.\n");
            }
        }
        
        System.out.print("\nSaliendo del sistema");
        for (int i=0; i<3; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
    }
}
