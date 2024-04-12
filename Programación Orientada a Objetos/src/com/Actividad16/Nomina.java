package com.Actividad16;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nomina {
    public static void main(String[] args) throws IOException {
        ArrayList<Empleado> employees = new ArrayList<Empleado>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int employeeID = 0;

        do {
            String name = "";
            double salary = 0;

            try {
                System.out.print("Ingresa el número de empleado: ");
                employeeID = Integer.parseInt(br.readLine());

                System.out.print("Ingresa el nombre: ");
                name = br.readLine();

                System.out.print("Ingresa el salario: ");
                salary = Double.parseDouble(br.readLine());

            } catch (NumberFormatException e) {
                break;
            }

            employees.add(new Empleado(employeeID, name, salary));

        } while(employeeID != 0);

        if (employees.size() > 0) {
            System.out.println("\tNómina de empleados");
            System.out.println("+---------------------------+");
            System.out.printf("No.\tNombre:\tSalario:\n");

            double payrollTotal = 0;

            for (Empleado employee : employees) {
                System.out.printf("%d\t%s\t%.2f\n", employee.getNumero(), employee.getNombre(), employee.getSueldo());

                payrollTotal += employee.getSueldo();
            }

            System.out.println("+---------------------------+");
            System.out.printf("Total de empleados: %d\nTotal de nómina: %.2f", employees.size(), payrollTotal);

        } else {
            System.err.println("No hay empleados en la base de datos.");
        }


    }
}
