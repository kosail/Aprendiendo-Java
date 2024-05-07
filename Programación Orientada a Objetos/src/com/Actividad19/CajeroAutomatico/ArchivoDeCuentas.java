package com.Actividad19.CajeroAutomatico;

import java.io.*;
import java.util.*;

public class ArchivoDeCuentas {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Cuenta> accounts = new ArrayList<Cuenta>(10);
		int amountOfAccounts = 0;

		
		do {
			System.out.print("¿Cuántas cuentas quieres registrar?\n(Ingresa 0 para salir.\n\n>> ");
			try {
				amountOfAccounts = Integer.parseInt(br.readLine());
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error leyendo la cantidad de cuentas. Ingresa la cantidad de cuentas, en números enteros.");
			}
		} while (amountOfAccounts < 0);

		int i = 0;
		while (i < amountOfAccounts) {
			try {
				System.out.print("Ingresa el número de cuenta: ");
				int accountID = Integer.parseInt(br.readLine());
	
				System.out.print("Nombre del titular de la cuenta: ");
				String accountHoldersName = br.readLine();
	
				System.out.print("Saldo inicial de la cuenta: ");
				double initialBalance = Double.parseDouble(br.readLine());
	
				Cuenta newAccount = new Cuenta(accountID, accountHoldersName, initialBalance);
	
				if (newAccount != null) {
					accounts.add(newAccount);
					System.out.println("\nCuenta registrada exitosamente.\n\n");
					i++;
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error leyendo la información de los ");
			}
		}

		if (accounts.size() > 0) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cuentas.dat"))) {
				oos.writeObject(accounts);
			} catch (IOException e) {
				System.err.println("Ha ocurrido un error generando el archivo de cuentas.");
				e.printStackTrace();
			}

			System.out.println("Cuentas.dat escritas en el disco duro correctamente.");
		} else {
			System.err.println("No hay registro de ninguna cuenta. No se ha exportado ningún archivo.");
		}
	}
}
