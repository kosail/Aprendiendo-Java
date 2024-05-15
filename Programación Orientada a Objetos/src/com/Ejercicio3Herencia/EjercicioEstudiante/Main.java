/* Notes from the dev:
 * 1.- A long and unnecessary complex program that would be easily done in normal programming... but welp, I'm trying to learn functional programming. 
 * 2.- I originally thought of using a HashSet to ensure that no Students would be duplicated on the registry. However, after the whole implementation and realizing that .contains() method uses Hashes to compare, and that I actually HAVE TO implement a custom way to tell Java how to recognize if two Students are equal (overriding the equals and hashCode method)... well things got really complicated.
 * 
 * Summarizing, I'm not allowed to change the Estudiante class nor any other class because my teacher handed over a strict UML class that I had to follow.
 * I kinda solve this issue of not being able to customize the Estudiante and derivated classes, by a comparation done with a stream (not so intelligent tbh, but it makes the job)
 */
package com.Ejercicio3Herencia.EjercicioEstudiante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.List;
import java.util.HashSet;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public class Main {
	// I tried my best to reduce the number of implementations for methods that basically will have the same code, so we will use enum to avoid ambiguity and make code more readable
	private static enum StudentStatus {
		GRADUATED,
		UNDERGRADUATE,
	};

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Estudiante> registeredStudents = new HashSet<>();

		while (true) {
			int option = 0;

			try {
				option = menu(br, option);

				if (option == 0) break;

				// Using pure funtional interfaces like Consumer, BiConsumer and TriConsumer (custom made)
				// Decided to create 2 separated methods on case 4 and 5 even tho they are almost the same, due to casting issues that I recognize are avoidable if I simply enforce a lil bit less on using functional stuff and early optimization. This is recorded to the future. Noted as personal dev experience.
				switch(option) {
					case 1 -> registerNewStudent.accept(br, registeredStudents, StudentStatus.GRADUATED);
					case 2 -> registerNewStudent.accept(br, registeredStudents, StudentStatus.UNDERGRADUATE);
					case 3 -> reportAllRegisteredStudents.accept(registeredStudents);
					case 4 -> reportAllGraduatedResults.accept(registeredStudents);
					case 5 -> reportAllUndergraduatedResults.accept(registeredStudents);
					default -> System.err.println("Has ingresado una opción no válida. Verifica la entrada que has proveído.\n");
				}

			} catch (IOException e) {
				System.err.println("Ha ocurrido un error de entrada o salida y no es posible interactuar con el usuario.\nCerrando sistema.\n");
				return;

			} catch (NumberFormatException e) {
				System.err.println("Has ingresado una opción no válida. Verifica la entrada que has proveído.\n");
			}
		}

		System.out.println("Gracias por usar nuestro sistema de control estudiantil.");
	}

	// A method just for the menu and input from the user for cleaner looks of code.
	static int menu(BufferedReader br, int option) throws IOException, NumberFormatException {
		System.out.println("\n+------------------------------------+\n");
		System.out.println("\tControl estudiantil");
		System.out.println("+------------------------------------+\n");
		System.out.println("Selecciona una opción: ");
		System.out.print("\t1) Alta Estudiante Graduado\n\t2) Alta Estudiante No Graduado\n\t3) Lista de Todos los Estudiantes\n\t4) Lista de Estudiantes Graduados\n\t5) Lista de Estudiantes No Graduados\n\n\t0) Salir\n\n>> ");
		
		return Integer.parseInt(br.readLine());
	}

	// Since Java's built-in functional interfaces only goes up to BiConsumer (and I needed a method that received 3 arguments and return void), I made my own
	static TriConsumer<BufferedReader, HashSet<Estudiante>, StudentStatus> registerNewStudent = (br, registeredStudents, typeOfStudent) -> {
		System.out.println("+--------------------------------------+\n");
		System.out.println("\tRegistro de nuevo estudiante");
		System.out.println("+--------------------------------------+\n");

		try {
			System.out.print("Ingresa el número de matrícula: ");
			int studentID = Integer.parseInt(br.readLine());
			
			// Check if the Students are already registered. If so, return to main menu.
			if ( registeredStudents.stream().anyMatch(st -> st.getMatricula() == studentID) ) {
				System.err.println("\nEl estudiante ya se encuentra registrado.\n");
				return;
			}

			System.out.print("Ingresa el nombre del estudiante: ");
			String name = br.readLine();

			Estudiante student;
			if (typeOfStudent == StudentStatus.GRADUATED) {
				student = new EstudianteGraduado(studentID, name);
			} else {
				student = new EstudianteNoGraduado(studentID, name);
			}
			
			// Read scores section. Just... normal programming. I have no idea how would I made functional programming here.
			int numberOfScores = 0;
			while(numberOfScores <= 0) {
				try {
					System.out.print("Ingresa la cantidad de notas a registrar de este estudiante: ");
					numberOfScores = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.err.println("Ingresa un número válido.");
				}
			}

			int[] scores = new int[numberOfScores];
			for (int i=0; i<scores.length; i++) {
				while(true) {
					try {
						System.out.print(String.format("Ingresa la %d° calificación: ", i + 1));
						scores[i] = Integer.parseInt(br.readLine());
						break;
					} catch (NumberFormatException e) {
						System.err.println("Ingresa un número válido.");
					}
				}
			}

			student.setCalificaciones(scores);

			if (registeredStudents.add(student)) System.out.println("\nEl estudiante se ha registrado correctamente.\n");

		} catch (IOException e) {
			System.err.println("Ha ocurrido un error de entrada o salida y no es posible interactuar con el usuario.\n");

		} catch (NumberFormatException ne) {
			System.err.println("Has ingresado una opción no válida. Verifica la entrada que has proveído.\n");
		}
	};

	// Private method that will not —and should not— interact with the user directly, but instead be a reusable support for the other methods to get just the graduated (or ungraduated) students in a List object
	private static BiFunction<StudentStatus, HashSet<Estudiante>, List<Estudiante>> getSegmentedStudents = (typeOfStudent, registeredStudents) -> {
		return registeredStudents.stream().filter( student ->
			(typeOfStudent == StudentStatus.GRADUATED && student instanceof EstudianteGraduado) ||
			(typeOfStudent == StudentStatus.UNDERGRADUATE && student instanceof EstudianteNoGraduado))
			.toList();
	};

	static Consumer<HashSet<Estudiante>> reportAllRegisteredStudents = (registeredStudents) -> {
		List<Estudiante> graduated = getSegmentedStudents.apply(StudentStatus.GRADUATED, registeredStudents);
		List<Estudiante> undergraduated = getSegmentedStudents.apply(StudentStatus.UNDERGRADUATE, registeredStudents);

		if (graduated.isEmpty() || undergraduated.isEmpty()) {
			System.err.println("No hay alumnos registrados.");
			return;
		}

		System.out.println("\n+--------------------------------------+\n");
		System.out.println("\tEstudiantes registrados:");
		System.out.println("+--------------------------------------+\n");

		registeredStudents.stream().forEach(stu -> System.out.println(stu.toString()));

		System.out.println("\n+--------------------------------------+\n");
		System.out.println("  Estudiantes graduados registrados:");
		System.out.println("+--------------------------------------+\n");

		graduated.stream().forEach(stu -> System.out.println(stu.toString()));

		System.out.println("\n+--------------------------------------+\n");
		System.out.println("  Estudiantes no graduados registrados:");
		System.out.println("+--------------------------------------+\n");

		undergraduated.stream().forEach(stu -> System.out.println(stu.toString()));
	};

	static Consumer<HashSet<Estudiante>> reportAllGraduatedResults = (registeredStudents) -> {
		List<Estudiante> students = getSegmentedStudents.apply(StudentStatus.GRADUATED, registeredStudents);

		if (students.isEmpty()) {
			System.err.println("No hay alumnos registrados.");
			return;
		}
		
		System.out.println("\n+--------------------------------------+\n");
		System.out.println("  Resultados de estudiantes graduados:");
		System.out.println("Matrícula\tNombre\tEstatus");
		System.out.println("+--------------------------------------+\n");

		students.forEach((st) -> {
			System.out.println(st.toString() + "\t" + ((EstudianteGraduado) st).calcularResultado());
		});
		
		int totalApproves = (int) students.stream().filter(st -> ((EstudianteGraduado) st).calcularResultado().equals("Aprobado")).count();
		int totalFails = (int) students.stream().filter(st -> ((EstudianteGraduado) st).calcularResultado().equals("Reprobado")).count();

		System.out.println("\n+--------------------------------------+\n");
		System.out.print("\tTotal de aprobados: " + totalApproves);
		System.out.print("\tTotal de reprobados: " + totalFails);
		
	};

	static Consumer<HashSet<Estudiante>> reportAllUndergraduatedResults = (registeredStudents) -> {
		List<Estudiante> students = getSegmentedStudents.apply(StudentStatus.UNDERGRADUATE, registeredStudents);
		
		if (students.isEmpty()) {
			System.err.println("No hay alumnos registrados.");
			return;
		}

		System.out.println("\n+----------------------------------------+\n");
		System.out.println("  Resultados de estudiantes no graduados:");
		System.out.println("Matrícula\tNombre\tEstatus");
		System.out.println("+----------------------------------------+\n");

		students.forEach((st) -> {
			System.out.println(st.toString() + "\t" + ((EstudianteNoGraduado) st).calcularResultado());
		});

		int totalApproves = (int) students.stream().filter(st -> ((EstudianteNoGraduado) st).calcularResultado().equals("Aprobado")).count();
		int totalFails = (int) students.stream().filter(st -> ((EstudianteNoGraduado) st).calcularResultado().equals("Reprobado")).count();

		System.out.println("\n+--------------------------------------+\n");
		System.out.print("\tTotal de aprobados: " + totalApproves);
		System.out.print("\tTotal de reprobados: " + totalFails);
	};
}