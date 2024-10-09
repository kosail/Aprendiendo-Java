package com.korealm.Unidad1;

/*
* Practica 1 - Fundamentos de base de datos
    * Hecho por:
        * Karla B. | https://github.com/Ka7suk0
        * David S. | https://github.com/kosail
    
    * Versión mínima de Java requerida: JDK 22
* Septiembre 5, 2024
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class U1Practica1 {
    
    static void printMenu() {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║         Sistema de equipos        ║");
        System.out.println("║═══════════════════════════════════║");
        System.out.println("║  1. Guardar equipo en el vector   ║");
        System.out.println("║  2. Mostrar datos de los equipos  ║");
        System.out.println("║  3. Equipos clasificados          ║");
        System.out.println("║  4. Equipo con más puntos         ║");
        System.out.println("║  5. Terminar                      ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.print("\t>> ");
    }
    
    static void registerTeam(Equipo[] teams, int teamIndexCounter, BufferedReader br) throws IOException, NumberFormatException {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║     Registrar un equipo nuevo:    ║");
        System.out.println("║═══════════════════════════════════║");
        
        System.out.print("║═ Nombre: ");
        String name = br.readLine();
        
        System.out.print("║═ División: ");
        char division = br.readLine().charAt(0);
        
        System.out.print("║═ No. Jugadores: ");
        int numberOfPlayers = Integer.parseInt(br.readLine());
        
        System.out.print("║═ Puntos: ");
        int score = Integer.parseInt(br.readLine());
        
        if (teamIndexCounter >= teams.length) {
            System.err.println("║   ¡ERROR! ALMACENAMIENTO LLENO!    ");
            System.err.println("║ No hay más espacio para registros  ");
            System.err.println("╚═══════════════════════════════════╝\n");
            return;
        }
        
        teams[teamIndexCounter] = new Equipo(name, division, numberOfPlayers, score);
        System.out.println("║  Equipo registrado exitosamente!   ");
        System.out.println("╚═══════════════════════════════════╝\n");
    }
    
    static void showAllTeams(Equipo[] teams, int teamIndexCounter) {
        if (teamIndexCounter == 0) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║     No hay equipos registrados    ║");
            System.out.println("╚═══════════════════════════════════╝\n");
            
        } else {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║    Lista de todos los equipos:    ║");
            System.out.println("║═══════════════════════════════════║");
            Arrays.stream(teams)
                    .filter(Objects::nonNull)
                    .forEach(team -> System.out.println("║ " + team));
            
            System.out.println("╚═══════════════════════════════════╝\n");
        }
    }
    
    static void showClassifications(Equipo[] teams, int teamIndexCounter) {
        if (teamIndexCounter == 0) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║    No hay equipos clasificados    ║");
            System.out.println("╚═══════════════════════════════════╝\n");
            
        } else {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║   Lista de equipos clasificados:  ║");
            System.out.println("║═══════════════════════════════════║");
            Arrays.stream(teams)
                    .filter(team -> team != null && team.getClasifica())
                    .map(Equipo::getNombre)
                    .forEach(team -> System.out.println("║ " + team));
            
            System.out.println("╚═══════════════════════════════════╝\n");
        }
    }
    
    static void showHighestScore(Equipo[] teams) {
        Optional<Equipo> highestTeam = Arrays.stream(teams)
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(Equipo::getPuntos));
        
        if (highestTeam.isEmpty()) {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║  No hay equipos con puntuación máxima ║");
            System.out.println("╚═══════════════════════════════════════╝\n");
            
        } else {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║ Equipo con la puntuación más alta ║");
            System.out.println("║═══════════════════════════════════║");
            
            System.out.printf("║ Equipo: %s\n║ Puntaje: %d\n", highestTeam.get().getNombre(), highestTeam.get().getPuntos());
            
            System.out.println("╚═══════════════════════════════════╝\n");
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Equipo[] ligaNorte = new Equipo[8];
        int teamsIndexCounter = 0;
        int option = 0;
        
        do {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                switch (option) {
                    case 1 -> {
                        registerTeam(ligaNorte, teamsIndexCounter, br);
                        teamsIndexCounter++;
                    }
                    case 2 -> showAllTeams(ligaNorte, teamsIndexCounter);
                    case 3 -> showClassifications(ligaNorte, teamsIndexCounter);
                    case 4 -> showHighestScore(ligaNorte);
                }
                
            } catch (IOException | NumberFormatException e) {
                System.err.println("Ha ocurrido un error procesando la información. Por favor, revisa la entrada y vuelve a intentarlo de nuevo.\n");
            }
        } while(option != 5);
        
        System.out.print("\nSaliendo del sistema");
        for (int i=0; i<3; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
    }
}
