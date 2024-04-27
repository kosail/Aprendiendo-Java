package com.CuentaObjetos;

import java.io.*;
import java.util.ArrayList;
import com.CuentaBanco.Cuenta;

public class CuentasObjeto implements Serializable {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Cuenta> accounts = new ArrayList<Cuenta>();
		int option = 0;

		do {
			try {
				System.out.print("\n¿Qué deseas hacer?\n\t1) Capturar información de cuentas\n\t2) Recuperar información de cuentas\n\t0) Salir\n\n>> ");
				option = Integer.parseInt(br.readLine());

				switch(option) {
					case 0:
						break;
					case 1:
						accountsReader(accounts, br);
						break;
					case 2:
						accountsRetriever();
						break;
					default:
						System.err.println("Ingresaste una opción no válida.");
						break;
				}
	
			} catch (IOException | NumberFormatException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		} while(option != 0);

		System.out.println("¡Esperamos verte pronto!");
	}

	public static void accountsReader(ArrayList<Cuenta> accounts, BufferedReader br) throws IOException {
		boolean loadNextAccount = true;

		while (loadNextAccount) {
			System.out.print("Ingresa el número de cuenta: ");
			int accountID = Integer.parseInt(br.readLine());
			System.out.print("Nombre del cuentahabiente: ");
			String name = br.readLine();
			System.out.print("Saldo de la cuenta: ");
			accounts.add(new Cuenta(accountID, name, Double.parseDouble(br.readLine())));

			System.out.print("\n¿Leer nueva cuenta?\n1) Sí\n2) No\n\n>> ");
			loadNextAccount = Integer.parseInt(br.readLine()) == 2 ? false : true; 
		}

		System.out.print("\033[H\033[2J");
        System.out.flush();

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cuentas.dat"))) {
			for (Cuenta acc : accounts) {
				oos.writeObject(acc);
			}
		}

		System.out.print("Cuentas guardadas exitosamente.\n\n");
	}

	public static void accountsRetriever() throws IOException, ClassNotFoundException  {
		System.out.println("\nHistorial de información de cuentas:");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cuentas.dat"))) {
			
			while (true) {
				try {
					Cuenta account = (Cuenta) ois.readObject();;
					System.out.println(account.toString());
				} catch (EOFException e) {
					break;
				}
				
			}
		}
	}
}
