package com.pruebaDiagnostica;

/*
 * Se cuenta con un trabajo que consta de "n" días y se pagan $10 diarios. Hay otro trabajo con el mismo número de días donde el primer día se paga $1, el segundo se pagan 2, el tercero 3 y así sucesivamente.
 * Desarrollar una aplicación que me infique cuál es el mejor trabajo pagado
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MejorTrabajo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa la cantidad de días: ");
        SalaryCalcPerTimeframe salaryCalc = new SalaryCalcPerTimeframe(Integer.parseInt(br.readLine()));
        
        if (salaryCalc.getJob1Salary() > salaryCalc.getJob2Salary()) {
            System.out.println("Trabajo 1 paga más.");
        } else if (salaryCalc.getJob1Salary() == salaryCalc.getJob2Salary()) {
            System.out.println("Pagan lo mismo.");
        } else {
            System.out.println("Trabajo 2 paga más.");
        }

        br.close();
    }
}