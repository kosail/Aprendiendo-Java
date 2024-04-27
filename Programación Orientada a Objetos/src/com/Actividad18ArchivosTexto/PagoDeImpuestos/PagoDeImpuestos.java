package com.Actividad18ArchivosTexto.PagoDeImpuestos;

import java.util.ArrayList;
import java.io.*;

public class PagoDeImpuestos {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> employees = new ArrayList<Employee>(10);
		int option = 0;
		
		do {
			try {
				System.out.println("\nSistema de impuestos de empleados");
				System.out.println("------------------------");
				System.out.print("1) Registrar empleado\n2) Generar archivo de impuestos\n0) Salir\n>> ");
				
				option = Integer.parseInt(br.readLine());
	
				if (option == 0) {
					break;
				}

				if (option == 1) {
					addEmployee(employees, br);		
				} else if (option == 2) {
					printTaxesToFile(employees, br);
				} else {
					System.err.println("Ingresaste una opción no válida. Por favor, rectifica las opciones disponibles.\n");
				}

			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error, por favor revisa la entrada que has dado al programa.");
				System.err.println("Tipo de error: " + e.getCause());
			}
		} while(option != 0);

		System.out.println("Gracias por usar nuestro sistema.");
	}


	public static void addEmployee(ArrayList<Employee> employees, BufferedReader br) throws IOException, NumberFormatException {
		System.out.print("Ingresa el ID del empleado: ");
		int employeeID = Integer.parseInt(br.readLine());
		System.out.print("Nombre del empleado: ");
		String name = br.readLine();
		System.out.print("Ingresa el salario: ");
		
		if ( employees.add(new Employee(employeeID, name, Double.parseDouble(br.readLine()))) ) {
			System.out.println("\nEmpleado registrado exitosamente.\n");
		} else {
			System.err.println("Ha ocurrido un error registrando al empleado. Por favor, revisa la información de entrada que proporcionaste.");
		};
	}

	public static void printTaxesToFile(ArrayList<Employee> employees, BufferedReader br) throws IOException, NumberFormatException {
		// Creating an array of objects of type File, thus will be easier to iterate over them later verifing if the files already exists and applying other comprobation and methods.
		// The order of the files within this File[] array is: ISPT, IMSS and INFONAVIT.
		File[] files = {new File("ISPT.txt"), new File("IMSS.txt"), new File("INFONAVIT.txt")};

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

			files[i].createNewFile();
		}

		for (int i=0; i<files.length; i++) {
			try ( BufferedWriter bw = new BufferedWriter(new FileWriter(files[i])) ) {
				for (int j=0; j<employees.size(); j++) {
					Employee currentEmployee = employees.get(j);
					
					String temp = String.format("%d\t%s\t%.2f", currentEmployee.getEmployeeID(), currentEmployee.getEmployeeName(), currentEmployee.getWage(), currentEmployee.getSATTax());
	
					if (i == 0) {
						bw.write(String.format("%s\t%.2f\n", temp, currentEmployee.getSATTax()));
					}
	
					if (i == 1) {
						bw.write(String.format("%s\t%.2f\n", temp, currentEmployee.getIMSSTax()));
					}
	
					if (i == 2) {
						bw.write(String.format("%s\t%.2f\n", temp, currentEmployee.getINFONAVITTax()));
					}
				}
				
			} catch (IOException e) {
				System.err.println("Ha ocurrido un error escribiendo los archivos.");
				return;
			}

			System.out.println("Archivos exportados exitosamente.");
		}

	}
}
