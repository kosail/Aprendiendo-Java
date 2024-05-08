package com.ExamenUnidad4;

import java.io.*;
import java.util.*;

public class AnalisisDeTerrenos {
	public static void main(String[] args) {
		List <Terreno> landLotsData;
		String fileName = "TerrenosRegistrados.dat";

		Optional<List<Terreno>> landLotsRetrieve = Optional.ofNullable(retrieveInformation(fileName));

		if (landLotsRetrieve.isEmpty()) System.exit(1); // No need to print anything to the user, as the retrievev method is already printing to System.err

		landLotsData = landLotsRetrieve.get();

		System.out.println("Información registrada de terrenos:");
		System.out.println("+----------------------------------+");
		landLotsData.stream().forEach(lot -> System.out.println(lot.toString()));

		System.out.println("\nExportando registros de terrenos con superficie menor a 200 mts²...");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Terrenos.txt"))) {
			landLotsData.stream()
			.filter(lot -> (lot.getFondo() * lot.getFrente()) < 200)
			.forEach(p -> {
				try {
					bw.write(p.toString() + "\n");
				} catch (IOException e) {
					System.err.println("\"Ha ocurrido un error exportando la información a Terrenos.txt\"");
				}
			});
			
			System.out.println("Reporte exportado correctamente a Terrenos.txt\n");

		} catch (IOException e) {
			System.err.println("Ha ocurrido un error exportando la información a Terrenos.txt");
		}

		System.out.print("Promedio de terrenos con costo de 10 o más metros de frente: ");
		System.out.println(
		landLotsData.stream()
		.filter(lot -> lot.getFrente() >= 10)
		.mapToDouble(p -> p.getFrente())
		.average().getAsDouble()
		);

	}


	static List<Terreno> retrieveInformation(String fileName) {
		List<Terreno> landLots = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			Terreno[] tempLandLots = (Terreno[]) ois.readObject();
			
			landLots = Arrays.asList(tempLandLots);

		} catch(IOException e) {
			System.err.println("Ha ocurrido un error cargando la información del archivo inficado.");
		} catch (ClassNotFoundException | ClassCastException e) {
			System.err.println("El archivo contiene información inválida o está corrupto");
			e.printStackTrace();
		}
		
		return landLots;
	}
}
