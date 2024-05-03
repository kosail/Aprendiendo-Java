package com.Actividad19.ReporteDeVentas;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class RegistroDeVentas {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Vendedor> salesmen = new ArrayList<Vendedor>();
		int currentSalesmanID = 0;

		do {
			System.out.println("Registro de vendedores");
			System.out.println("----------------------\n");
			System.out.print("Ingresa el número de vendedor: ");

			try {
				currentSalesmanID = Integer.parseInt(br.readLine());
				if (currentSalesmanID == 0) break;

				System.out.print("Nombre: ");
				String name = br.readLine();

				System.out.print("Número del departamento al que pertenece: ");
				int section = Integer.parseInt(br.readLine());

				System.out.print("Ventas: ");
				double sales = Double.parseDouble(br.readLine());

				Vendedor currentSalesman = new Vendedor(currentSalesmanID, name, section, sales);

				if (currentSalesman != null) {
					salesmen.add(currentSalesman);
					System.out.println("-----------------------------------\n");
					System.out.println("\nVendedor registrado exitosamente.");
				}
				
			} catch (IOException e) {
				System.err.println("La información no pudo ser leída correctamente. El programa se cerrará debido a que no es posible recibir entrada del usuario.");
				System.exit(1);

			} catch (NumberFormatException e) {
				System.err.println("La información proveída no es válida, revisa la información que ingresaste e intenta de nuevo.");
			}
		} while (currentSalesmanID != 0);

		salesmen.stream().forEach(salesman -> System.out.println(salesman.toString()));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Vendedores.dat"))) {
			if (salesmen.size() != 0) {
				oos.writeObject(salesmen);
			} else {
				System.err.println("No se tiene registro de ningún vendedor todavía, por lo que no se puede escribir información.");
			}
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error guardando la información de los vendedores en un archivo.\nInformación adicional del error:\n");
			e.printStackTrace();
		}
	}
}
