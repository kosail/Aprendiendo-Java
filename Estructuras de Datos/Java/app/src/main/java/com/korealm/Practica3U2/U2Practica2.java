package com.korealm.Practica3U2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class U2Practica2 {
    static void printMenu() {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)| Sistema de gestión de libros\n");
        
        System.out.println("\t1) Insertar un libro");
        System.out.println("\t2) Eliminar un libro de Historia");
        System.out.println("\t3) Eliminar un libro de Novela");
        System.out.println("\t4) Mostrar libros de Historia");
        System.out.println("\t5) Mostrar libros de Novela");
        System.out.println("\t6) Terminar");
        
        System.out.print(">> ");
    }
    
    static void insertarLibro(BufferedReader br, PilaLibros novela, PilaLibros historia) throws IOException, NumberFormatException {
        System.out.println("Registro de nuevo libro");
        
        System.out.print("\tNombre del libro: ");
        String bookName = br.readLine().trim();
        System.out.print("\tAutor del libro: ");
        String autor = br.readLine().trim();
        System.out.print("\tPrecio del libro: ");
        float price = Float.parseFloat(br.readLine());
        
        Libro book = new Libro(bookName, autor, price);
        
        try {
            if (price < 300) {
                libroRegister(novela, book);
            } else {
                libroRegister(historia, book);
            }
            
            System.out.println("Registro de nuevo libro completo");
            
        } catch (ArrayStoreException e) {
            System.err.println("PILA LLENA, NO SE PUEDE INSERTAR\n");
        }
        
    }
    
    static void eliminarLibroHistoria(PilaLibros historia) {
        popLibro(historia, "HISTORIA");
    }
    
    static void eliminarLibroNovela(PilaLibros novela) {
        popLibro(novela, "NOVELA");
    }
    
    static void mostrarLibrosHistoria(PilaLibros historia) {
        System.out.println(historia.toString());
    }
    
    static void mostrarLibrosNovela(PilaLibros novela) {
        System.out.println(novela.toString());
    }
    
    private static void popLibro(PilaLibros libros, String stackName) {
        Libro removed = libros.pop();
        
        if (Objects.isNull(removed)) {
            System.err.printf("NO HAY LIBROS DE %s PARA ELIMINAR.", stackName);
            return;
        }
        
        System.out.println(removed.getTitulo() + "\n");
    }
    
    private static void libroRegister(PilaLibros stack, Libro book) throws ArrayStoreException {
        if (stack.isFull()) throw new ArrayStoreException();
        
        stack.push(book);
    }
    
    
    public static void main(String[] args) {
        final PilaLibros historia = new PilaLibros(5);
        final PilaLibros novela = new PilaLibros(7);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        
        do {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                switch (option) {
                    case 1 -> insertarLibro(br, novela, historia);
                    case 2 -> eliminarLibroHistoria(historia);
                    case 3 -> eliminarLibroNovela(novela);
                    case 4 -> mostrarLibrosHistoria(historia);
                    case 5 -> mostrarLibrosNovela(novela);
                    case 6 -> System.out.println("\nSaliendo del sistema...\n");
                    default -> System.err.println("Ingresaste una opción no válida. Intenta de nuevo.");
                }
                
            } catch (IOException e) {
                System.err.println("Ha ocurrido un error en la lectura/escritura.\n Error de tipo: " + e.getClass().getSimpleName());
                
            } catch (NumberFormatException e) {
                System.err.println("Ha ocurrido un error con los datos ingresados.\n Error de tipo: " + e.getClass().getSimpleName());
            }
        
        } while (option != 6);
        
    }
}
