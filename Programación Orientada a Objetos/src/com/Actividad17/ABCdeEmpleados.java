package com.Actividad17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class ABCdeEmpleados {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Empleado> employees = new ArrayList<Empleado>();
        int menuOptionSelected = -1;

        do {
            System.out.printf("+-----------------------------------+\n");
            System.out.printf("\033[36m%30s%n\033[0m", "Aplicación de empleados");
            System.out.printf("+-----------------------------------+\n");
            System.out.printf("0) Salir\n1) Altas\n2) Bajas\n3) Catálogo de empleados\n\n");
            System.out.printf("%30s%n", "-----------------------");
            System.out.print(">> ");

            try {
                menuOptionSelected = Integer.parseInt(br.readLine());

                if (menuOptionSelected > 0 && menuOptionSelected < 3) {
                    System.out.print("Número de empleado: ");
                    int employeeID = Integer.parseInt(br.readLine());
                    Empleado employeeRegistered = employeeRegistryChecker(employees, employeeID);

                    if (menuOptionSelected == 1) {
                        if (employeeRegistered != null) {
                            System.err.printf("\033[31mEl empleado no fue registrado porque ya existe.\033[0m\n");
                            Thread.sleep(1500);
                            clearTerminal();
                            continue;
                        }

                        System.out.print("Nombre del empleado: ");
                        String name = br.readLine();
                
                        System.out.print("Salario: ");
                        double salary = Double.parseDouble(br.readLine());
                
                        employees.add(new Empleado(employeeID, name, salary));
                        System.out.printf("\033[32mEmpleado registrado existosamente.\033[0m\n");
                    }

                    if (menuOptionSelected == 2) {
                        if (employeeRegistered == null) {
                            System.err.printf("\033[31mNo existe ningún empleado con ID: %d\033[0m\n", employeeID);
                            Thread.sleep(1500);
                            clearTerminal();
                            continue;
                        }

                        employees.remove(employeeRegistered);
                        System.out.printf("\033[32mEmpleado dado de baja existosamente.\033[0m\n");
                    }
                }

                if (menuOptionSelected == 3) {
                    System.out.printf("%-15s %-20s %s\n", "No.", "Nombre", "Salario");
                    System.out.printf("---------------------------------------------\n");

                    for (Empleado employee : employees) {
                        System.out.printf("%-20d %-20s %.2f\n", employee.getNumero(), employee.getNombre(), employee.getSueldo());
                    }
                }

                
            } catch (NumberFormatException e) {
                System.err.println("Solicitud inválida, ingresa una de las opciones disponibles.");
            }

        } while(menuOptionSelected != 0);
            
        System.out.println("Gracias por usar nuestro sistema de empleados.\n¡Nos vemos pronto!");
    }


    private static Empleado employeeRegistryChecker(ArrayList<Empleado> employees, int employeeID) {
        for (Empleado employee: employees) {
            if (employee.getNumero() == employeeID) {
                return employee;
            }
        }

        return null;
    }

    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
