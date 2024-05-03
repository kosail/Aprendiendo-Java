package com.GeneradorTerrenosDeTexto;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class GeneradorTerrenosTexto {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Terreno> landLots = new ArrayList<Terreno>(10);
		int option = 0;

		do {
			try {
				System.out.println("\n Administrador de terrenos");
				System.out.println("------------------------");
				System.out.print("1) Registrar terreno\n2) Exportar registro a archivo\n0) Salir\n>> ");
				
				option = Integer.parseInt(br.readLine());
	
				if (option == 0) {
					break;
				}

				if (option == 1) {
					registerLandLot(landLots, br);		
				} else if (option == 2) {
					exportRegistryToFile(landLots);
				} else {
					System.err.println("Ingresaste una opción no válida. Por favor, rectifica las opciones disponibles.\n");
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error, por favor revisa la entrada que has dado al programa.");
				System.err.println("Tipo de error: " + e.getMessage());
			}
		} while(option != 0);
	}

	public static void registerLandLot(List<Terreno> landLots, BufferedReader br) throws IOException {
		System.out.print("Ingresa el tamaño de fondo en metros: ");
		double fondo = Double.parseDouble(br.readLine());

		System.out.print("Tamaño de frente en metros: ");
		double frente = Double.parseDouble(br.readLine());

		System.out.print("Ubicación: ");
		String ubicacion = br.readLine();

		System.out.print("Precio por metro cuadrado en MXN: ");
		double precioM2 = Double.parseDouble(br.readLine());

		Terreno newLandLot = new Terreno(fondo, frente, ubicacion, precioM2);
		if ( newLandLot != null) {
			landLots.add(newLandLot);
			System.out.println("Terreno registrado exitosamente.\n\n");
		}
	}

	public static void exportRegistryToFile(List<Terreno> landLots) throws IOException {
		try (
			ObjectOutputStream landLotsOOS = new ObjectOutputStream(new FileOutputStream("Terrenos.dat"));
			BufferedWriter landLotsBW = new BufferedWriter(new FileWriter("Terrenos.txt"));
		) {
			if (landLots.size() != 0) {
				landLotsOOS.writeObject(landLots);				

				landLots.stream().forEach(lot -> {
					try {
						landLotsBW.write(lot.toString() + "\n");
					} catch (IOException e) {
						System.err.println("Ha ocurrido un error escribiendo el registro de terrenos a texto.");
					}
				});
				
			} else {
				System.err.println("No se han registrado terrenos.\nArchivos no generados.");
			}
		} catch (IOException e) {

		}
	}
}