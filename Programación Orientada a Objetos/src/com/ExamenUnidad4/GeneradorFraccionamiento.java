package com.ExamenUnidad4;

import java.io.*;

public class GeneradorFraccionamiento {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Ingresa la cantidad de terrenos a registrar: ");
		int amountOfLands = Integer.parseInt(br.readLine());
		Terreno[] landLots = new Terreno[amountOfLands];

		for (int i = 0; i<amountOfLands; i++) {
			System.out.println("\nTerreno " + (i + 1) + ":");
			System.out.print("Ingresa el tamaño del fondo en metros: ");
			double fondo = Double.parseDouble(br.readLine());
			
			System.out.print("Ingresa el tamaño del frente en metros: ");
			double frente = Double.parseDouble(br.readLine()); 
			
			System.out.print("Ingresa la ubicación del terreno: ");
			String ubicacion = br.readLine();
	
			System.out.print("Ingresa el precio por metro cuadrado: ");
			double precio = Double.parseDouble(br.readLine());

			landLots[i] = new Terreno(fondo, frente, ubicacion, precio);
		}
		
		System.out.println("\nTerrenos capturados correctamente.\n");
		System.out.println("Exportando terrenos a archivo \"TerrenosRegistrados.dat\".");

		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("TerrenosRegistrados.dat"))) {
			outStream.writeObject(landLots);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Terrenos exportados a archivo \"TerrenosRegistrados.dat\".");
	}
}
