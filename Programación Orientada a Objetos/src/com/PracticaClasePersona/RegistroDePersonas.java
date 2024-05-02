package com.PracticaClasePersona;

import java.io.*;
import java.util.ArrayList;

public class RegistroDePersonas {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Persona> majors = new ArrayList<Persona>(10);
		ArrayList<Persona> minors = new ArrayList<Persona>(10);
		int option = 0;

		do {
			try {
				System.out.println("\n Sistema de registro de personas");
				System.out.println("------------------------");
				System.out.print("1) Registrar persona\n2) Generar de personas por edad\n0) Salir\n>> ");
				
				option = Integer.parseInt(br.readLine());
	
				if (option == 0) {
					break;
				}

				if (option == 1) {
					addPerson(majors, minors, br);		
				} else if (option == 2) {
					printPersonsReportFile(majors, minors, br);
				} else {
					System.err.println("Ingresaste una opción no válida. Por favor, rectifica las opciones disponibles.\n");
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error, por favor revisa la entrada que has dado al programa.");
				System.err.println("Tipo de error: " + e.getMessage());
			}
		} while(option != 0);
	}


	public static void addPerson(ArrayList<Persona> majors, ArrayList<Persona> minors, BufferedReader br) throws IOException, NumberFormatException {
		System.out.print("Ingresa el nombre de la persona: ");
		String name = br.readLine();

		System.out.print("Ingresa la edad: ");
		int age = Integer.parseInt(br.readLine());

		System.out.print("Peso (en KGs): ");
		double weight = Double.parseDouble(br.readLine());

		System.out.print("Altura (en metros): ");
		double height = Double.parseDouble(br.readLine());

		Persona newPerson = new Persona(name, age, weight, height);
		if ( newPerson != null) {
			if (age >= 18) {
				majors.add(newPerson);
			} else {
				minors.add(newPerson);
			}
			
			System.out.println("\nPersona registrada exitosamente.\n");
		} else {
			System.err.println("Ha ocurrido un error registrando a la persona en el sistema. Por favor, revisa la información de entrada que proporcionaste.");
		};
	}

	public static void printPersonsReportFile(ArrayList<Persona> majors, ArrayList<Persona> minors, BufferedReader br) throws IOException, NumberFormatException {
		File[] files = {new File("Mayores.dat"), new File("Menores.dat")};

		for (int i=0; i<files.length; i++) {
			if (files[i].exists()) {
				String actualFileName = files[i].getName();
				System.out.print("El archivo " + actualFileName + " ya existe. ¿Sobreescribir?\n1) Sí\n2) No\n>> ");
				
				int doOverwrite = Integer.parseInt(br.readLine());
				if (doOverwrite == 2) {
					int counter = 1;
					while (files[i].exists()) {
						files[i] = new File(String.format("%s-%d%s", actualFileName.substring(0, actualFileName.indexOf(".")), counter, actualFileName.substring(actualFileName.lastIndexOf("."))));
						counter++;
					}
				}
			}
		}

		try (
			ObjectOutputStream majorsOOS = new ObjectOutputStream(new FileOutputStream(files[0]));
			ObjectOutputStream minorsOOS = new ObjectOutputStream(new FileOutputStream(files[1]));
			) {
				majorsOOS.writeObject(majors);
				minorsOOS.writeObject(minors);

				System.out.println("Reportes generados exitosamente.");
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error escribiendo los archivos.");
			System.err.print("Información sobre la excepción: ");
			e.printStackTrace();
		}
	}
}
