package com.korealm.Examen1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class ExamenU1 {
    
    static void captureCone(BufferedReader br, Cono[] figuras) throws IOException, NumberFormatException {
        System.out.println("+-- Registrar nuevo cono --+\n");
        
        System.out.print("Radio: ");
        final float radio = Float.parseFloat(br.readLine());
        System.out.print("Altura: ");
        final float altura = Float.parseFloat(br.readLine());
        
        
        while (true) {
            System.out.println("Ingresa el índice de la posición del vector en la cual quieras guardarlo.\nPosiciones disponibles:\n");
            
            for (int i = 0; i < figuras.length; i++) {
                System.out.printf("\t%d)", i);
                if (Objects.nonNull(figuras[i])) {
                    System.out.println("ESPACIO DISPONIBLE");
                } else {
                    System.out.println("ESPACIO OCUPADO");
                }
            }
            
            System.out.print(">> ");
            final int position = Integer.parseInt(br.readLine());
            
            if (position < 0 || position > 4) {
                System.err.println("CASILLA NO EXISTE");
                continue;
            }
            
            if (Objects.nonNull(figuras[position])) {
                System.err.println("CASILLA YA OCUPADA POR OTRA FIGURA");
                continue;
            }
            
            figuras[position] = new Cono(radio, altura);
            System.out.println("FIGURA CREADA EXITOSAMENTE.\n");
            return;
        }
    }
    
    static void showAllCones(Cono[] figuras) {
        System.out.println("+-- Información de todos los conos --+\n");
        
        for (int i = 0; i < figuras.length; i++) {
            if (Objects.nonNull(figuras[i])) {
                System.out.printf("Posición %d) %s", i, figuras[i]);
            }
        }
    }
    
    static void sumAllVolumes(Cono[] figuras) {
        System.out.printf("+-- Suma de los volúmenes de todos los conos registrados --+\n\n%.2f",
                Arrays.stream(figuras).filter(Objects::nonNull).mapToDouble(Cono::volumen).sum()
        );
    }
    
    // TODO
    static void matrixGenerator(BufferedReader br) throws IOException, NumberFormatException {
        System.out.println("+-- Generador de matrices --+");
        
        System.out.print("Cantidad de casillas: ");
        final int n = Integer.parseInt(br.readLine());
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) ((Math.random() * 100) % 51);
            }
            
            // welp...
        }
        
    }
    
    static void printMenu() {
        System.out.println("╭━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╮");
        System.out.println("┃                  EXAMEN UNIDAD 1               ┃");
        System.out.println("┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃");
        System.out.println("┃              1. Captura de un cono             ┃");
        System.out.println("┃      2. Mostrar datos de todos los conos       ┃");
        System.out.println("┃               3. Suma de volúmenes             ┃");
        System.out.println("┃             4. Manejo de una matriz            ┃");
        System.out.println("┃                    5. Terminar                 ┃");
        System.out.println("╰━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╯");
        System.out.print("\n>> ");
    }
    
    
    public static void main(String[] args) {
        Cono[] figuras = new Cono[5];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        
        while (true) {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                if (option == 5) break;
                
                switch (option) {
                    case 1 -> captureCone(br, figuras);
                    case 2 -> showAllCones(figuras);
                    case 3 -> sumAllVolumes(figuras);
                    case 4 -> matrixGenerator(br);
                }
            } catch (IOException | NumberFormatException e) {
                System.err.println("Ha ocurrido un error procesando la información. Por favor, revisa la entrada y vuelve a intentarlo de nuevo.\n");
            } catch (IllegalArgumentException e) {
                System.err.println("Ingresaste una opción no válida");
            }
        }
        
        System.out.println("¡Ten un buen día!");
    }


}
