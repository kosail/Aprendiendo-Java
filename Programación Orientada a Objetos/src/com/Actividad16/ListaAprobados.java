package com.Actividad16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class ListaAprobados {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Estudiante[] students = null;

        System.out.print("Ingresa el número de estudiantes: ");

        try {
            // Create an array of students of the size indicated by the user.
            students = new Estudiante[Integer.parseInt(br.readLine())];

            // Iterate creating student objects to fill each position in the array until is full.
            for (int i=0; i<students.length; i++) {

                System.out.print("\nIngresa el número de matrícula: ");
                int studentID = Integer.parseInt(br.readLine());

                System.out.print("Ingresa el nombre: ");
                String studentName = br.readLine();

                System.out.print("Ingresa la carrera: ");
                String studentDegree = br.readLine();
                
                students[i] = new Estudiante(studentID, studentName, studentDegree);

                updateGrades(students[i], br);

                clearTerminal();
            }

        } catch (NumberFormatException e) {
            System.out.println("Error leyendo los datos.");
            System.out.printf("Detalles del error: %s\n", e.getCause());
            e.printStackTrace();
            System.exit(1);
        }

        // Double checking if the user wants to make further changes on the grades of the students
        int temp = 2;
        do {
            System.out.println("\n¿Actualizar notas de estudiantes?\n1) Sí\n2) No\n>> ");
            temp = Integer.parseInt(br.readLine());

            if (temp == 1) {
                System.out.print("Ingresa la posición del estudiante del cuál quieres ingresar las calificaciones: ");
                updateGrades(students[Integer.parseInt(br.readLine())], br);
            }
        } while(temp != 2);

        // To ensure that the user had not make an input of zero students of failed to initialize the Estudiante object leaving it to null.
        if (students != null && students.length > 0) {
            Estudiante[] approvedStudents = new Estudiante[students.length];
            double averageScore = 0;

            for (int i=0; i<students.length; i++) {
                if (students[i].calcularPromedio() > 70) {
                    approvedStudents[i] = students[i];
                    averageScore += students[i].calcularPromedio();
                }
            }

            clearTerminal();
            System.out.println("\nEstudiantes aprobados");
            System.out.println("+-------------------------+");

            for (Estudiante student : approvedStudents) {
                System.out.println(student.toString());
            }

            System.out.println("+-------------------------+");
            System.out.printf("Total de estudiantes aprobados: %d\nPromedio de aprobados: %.2f\n", students.length, averageScore/students.length);

        } else {
            System.out.println("No hay registros de estudiantes.");
        }
    }

    public static void updateGrades(Estudiante student, BufferedReader br) throws IOException {
        System.out.print("¿Ingresar 1 o varias calificaciones?\n1) Una\n2) Varias\n>> ");
        int temp = Math.abs(Integer.parseInt(br.readLine())); // To ensure we will only take positive values.

        if (temp == 0) {
            System.out.println("No fue ingresada ninguna calificación.");
            
        } else if (temp == 1) { // If the user inputs only one grade.
            if (student.getCalificaciones() == null) { // If the user has NOT made any grade input before, the students double[] containing the grades does not exist, thus we will proceed creating one of only 1 position. We can overload the setCalificacion method to just store and display one value, instead of creating a whole array. However, I have decided to stick to the base model requested. 
                System.out.print("Ingresa la calificación: ");

                student.setCalificaciones(new double[1]);
                student.setCalificacion(Double.parseDouble(br.readLine()), 0);
            } else {
                System.out.print("Ingresa la posición de la calificación a ser guardada en la lista de calificaciones: ");
                int position = Integer.parseInt(br.readLine());

                System.out.print("Ingresa la calificación: ");
                student.setCalificacion(Double.parseDouble(br.readLine()), position);
            }
            

        } else { // If the user inputs many grades.
            System.out.print("Número de calificaciones a ingresar: ");
            double[] grades = new double[Integer.parseInt(br.readLine())];
            Arrays.fill(grades, 0);

            System.out.print("Ingresa todas las calificaciones separadas por un espacio: ");
            
            String[] studentGradesRaw = br.readLine().split(" ");

            for (int j=0; j<studentGradesRaw.length; j++) {
                grades[j] = Double.parseDouble(studentGradesRaw[j]);
            }

            student.setCalificaciones(grades);
        }
    }

    public static void clearTerminal() { // Method to clear the terminal and flush the buffer
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
