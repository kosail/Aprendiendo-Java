package com.Actividad18ArchivosTexto.ControlDeVehiculos;

import java.io.*;
import java.util.ArrayList;

public class ControlDeVehiculos {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(5);
		int option = 0;

		do {
			try {
				System.out.println("\nSistema de control de vehículos");
				System.out.println("------------------------");
				System.out.print("1) Registrar vehículo\n2) Generar informe de vehículos\n0) Salir\n>> ");
				
				option = Integer.parseInt(br.readLine());
	
				if (option == 0) {
					break;
				}

				if (option == 1) {
					addVehicle(vehicles, br);		
				} else if (option == 2) {
					printVehicleReportFile(vehicles, br);
				} else {
					System.err.println("Ingresaste una opción no válida. Por favor, rectifica las opciones disponibles.\n");
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error, por favor revisa la entrada que has dado al programa.");
				System.err.println("Tipo de error: " + e.getCause());
			}
		} while(option != 0);
	}


	public static void addVehicle(ArrayList<Vehicle> vehicles, BufferedReader br) throws IOException, NumberFormatException {
		System.out.print("Ingresa el número de placa: ");
		String licensePlate = br.readLine();

		System.out.print("Descripción del vehículo: ");
		String description = br.readLine();

		System.out.print("Modelo del vehículo: ");
		int model = Integer.parseInt(br.readLine());

		System.out.print("Costo del vehículo: ");
		double cost = Double.parseDouble(br.readLine());
		
		if ( vehicles.add(new Vehicle(licensePlate, description, model, cost)) ) {
			System.out.println("\nVehiculo registrado exitosamente.\n");
		} else {
			System.err.println("Ha ocurrido un error registrando al vehículo. Por favor, revisa la información de entrada que proporcionaste.");
		};
	}

	public static void printVehicleReportFile(ArrayList<Vehicle> vehicles, BufferedReader br) throws IOException, NumberFormatException {
		File[] files = {new File("AutosDeLujo.txt"), new File("AutosNormales.txt")};

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

		try (
			BufferedWriter expensiveCarBuffer = new BufferedWriter(new FileWriter(files[0]));
			BufferedWriter normalCarBuffer = new BufferedWriter(new FileWriter(files[1])) 
			) {
			for (int j=0; j<vehicles.size(); j++) {
				Vehicle currentVehicle = vehicles.get(j);

				if (currentVehicle.getCost() > 500_000) {
					expensiveCarBuffer.write(currentVehicle.toString() + "\n");
				} else {
					normalCarBuffer.write(currentVehicle.toString() + "\n");
				}
			}
			
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error escribiendo los archivos.");
			return;
		}
		System.out.println("Reportes generados exitosamente.");
	}

}
