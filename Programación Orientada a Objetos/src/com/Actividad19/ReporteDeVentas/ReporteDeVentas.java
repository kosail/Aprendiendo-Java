package com.Actividad19.ReporteDeVentas;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ReporteDeVentas {
	@SuppressWarnings("unchecked")
	// I know that I should never use annotations to suppress warnings, but I don't get why I'm getting the warning of possible breakage due to unchecked cast from Object to my List of Vendedores.
	// Like, I'm ALREADY handling the possible case with the ClassNotFoundException at the catch statement, so... ????
	public static void main(String[] args) {
		List<Vendedor> salesmen = new ArrayList<Vendedor>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Vendedores.dat"))) {
			salesmen = (ArrayList<Vendedor>) ois.readObject();
		} catch (IOException e ) {
			System.err.println("No se ha podido cargar la información de los vendedores de Vendedores.dat.\nAsegúrate que el archivo exista y que contenga información válida.");
			System.exit(1);

		} catch (ClassCastException | ClassNotFoundException e) {
			System.err.println("Ha ocurrido un error cargando la información de los vendedores: El archivo Vendedores.dat está corrompido o contiene información no válida.");
			System.exit(1);
		}

		System.out.println("Lista de vendedores");
		System.out.println("-------------------\n");
		System.out.println("Número\tNombre\tVentas");
		System.out.println("------------------------------\n");

		salesmen.stream()
		.sorted(Comparator.comparingDouble(Vendedor::getVentas).reversed()).
		forEach(System.out::println);;

		System.out.print ("\nTotal de ventas:\t" + salesmen.stream()
		.mapToDouble(Vendedor::getVentas)
		.sum()
		+ "\n");
	}
}
