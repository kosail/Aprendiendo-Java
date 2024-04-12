package com.Academia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Academia {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Profesor> professors = new ArrayList<Profesor>();
        HashMap<Integer, Profesor> professorPerCategory = new HashMap<>();

        int optionChosed = 0;

        do {
            System.out.printf("+-----------------------------------+\n");
            System.out.printf("\033[36m%30s%n\033[0m", "Aplicación de Profesorado");
            System.out.printf("+-----------------------------------+\n");
            System.out.printf("1) Registrar profesor\n2) Dar de baja un profesor\n3) Consultar profesores por categorías\n4) Total de horas por profesores\n5) Salir\n\n");
            System.out.printf("%30s%n", "-----------------------");
            System.out.print(">> ");

            try {
                optionChosed = Integer.parseInt(br.readLine());

                if (optionChosed == 1 || optionChosed == 2) {
                    System.out.print("No. de expediente: ");
                    int professorID = Integer.parseInt(br.readLine());
                    Profesor registeredProfessor = professorRegistryCheck(professors, professorID);

                    if (optionChosed == 1) {
                        if (registeredProfessor != null) {
                            System.err.printf("\033[31mProfesor no añadido porque ya está registrado.\033[0m\n");
                            Thread.sleep(1500);
                            clearTerminal();
                            continue;
                        }

                        System.out.print("Nombre: ");
                        String name = br.readLine();
                
                        System.out.print("Horas trabajadas: ");
                        double workedHours = Double.parseDouble(br.readLine());
                        
                        System.out.print("Categoría: ");
                        int category = Integer.parseInt(br.readLine());
                
                        Profesor applicantProfessor = new Profesor(professorID, name, workedHours, category);

                        professors.add(applicantProfessor);
                        professorPerCategory.put(applicantProfessor.getCategoria(), applicantProfessor);

                        System.out.printf("\033[32mProfesor registrado existosamente.\033[0m\n");
                    }

                    if (optionChosed == 2) {
                        if (registeredProfessor == null) {
                            System.err.printf("\033[31mNo existe ningún profesor con el ID: %d\033[0m\n", professorID);
                            Thread.sleep(1500);
                            clearTerminal();
                            continue;
                        }

                        professors.remove(registeredProfessor);
                        professorPerCategory.remove(registeredProfessor.getCategoria(), registeredProfessor);

                        System.out.printf("\033[31mProfesor dado de baja existosamente.\033[0m\n");
                    }
                }

                if (optionChosed == 3) {
                    for (int category : professorPerCategory.keySet()) {
                        System.out.printf("Categoría %d:\n", category);

                        for (int i=0; i<professorPerCategory.get(category).size(); i++) {
                            System.out.println(professorPerCategory.get(category).toString());
                        }
                    }
                    
                }
                
                if (optionChosed == 4) {
                    double totalOfWorkedHours = 0;
                    for (Profesor p : professors) {
                        totalOfWorkedHours += p.getHoras();
                    }

                    System.out.printf("\nTotal de horas trabajadas: %.2f\n", totalOfWorkedHours);

                }
                
            } catch (NumberFormatException e) {
                System.err.println("Solicitud inválida, ingresa una de las opciones disponibles.");
            }


        } while(optionChosed != 5);
    }

    private static Profesor professorRegistryCheck(ArrayList<Profesor> professors, int professorID) {
        for (Profesor p : professors) {
            if (p.getExpediente() == professorID) {
                return p;
            }
        }
        return null;
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}