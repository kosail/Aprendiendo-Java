package com.Actividad19.CajeroAutomatico;

import java.io.*;
import java.util.*;

public class CajeroAutomatico {
	public static void main(String[] args) throws InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Cuenta> accounts = new ArrayList<>(); // Initiaslizing the object cuz... welp, Java complains if not.
		LinkedList<String> fallbackHistoryOfChanges = new LinkedList<String>();

		System.out.print("Cargando cuentas de \"Cuentas.dat\""); // Adding sugar to the user experience
		for (int i=0; i<3; i++) {
			System.out.print(".");
			Thread.sleep(800);
		}
		
		// Try to retrieve the accounts using an optional and avoid unexpected NullPointerExceptions
		Optional<List<Cuenta>> retrieve = Optional.ofNullable(retrieveAccounts());
		if (retrieve.isEmpty()) {
			System.err.println("\nTerminando la ejecución del programa por errores leyendo la información de las cuentas.");
			System.exit(1); // Making sure that ANYTHING of the code ahead WILL NOT execute in case the program fails to load Cuentas.dat.
		} else {
			accounts = retrieve.get();
		}
		
		int option = 0;
		while(true) {
			try {
				System.out.println("\n\nCajero Automático");
				System.out.println("-----------------\n");
				System.out.println("¿Qué quieres hacer hoy?");
				System.out.println("1) Depósito\n2) Retiro\n3) Consulta de saldo\n0) Terminar la sesión");

				option = Integer.parseInt(br.readLine());

				if (option == 0) break;

				if (option < 1 || option > 3) {
					System.err.println("\nHas ingresado una opción no válida. Por favor, intenta de nuevo.\n");
				}

				System.out.print("Ingresa el número de la cuenta: ");
				int accountID = Integer.parseInt(br.readLine());

				// Using a stream to check if there is an actual account with the provided account number
				if (! accounts.stream().anyMatch((a) -> a.getNumero() == accountID)) {
					System.err.println("\nLa cuenta indicada no existe.");
					continue;
				}

				int amount = 0;
				if (option == 1 || option == 2) {
					do {
						System.out.print("Ingresa el monto: ");
						amount = Integer.parseInt(br.readLine());
						
						if (amount <= 0) System.err.println("\nEl monto no es válido.");
					} while (amount == 0);
				}

				// Taking the risk of using the .get() method (from Optional objects) since we already comprobated the accountID before (in line 44)
				// and we are pretty sure the account actually exist in the List. If there where no account, Optional would return a null and .get()
				// will try to retrieve from a null object and... welp, winner winner chicken dinner we get a flawless NullPointerException.
				int accountIndex = accounts.indexOf(
					accounts.stream()
					.filter(acc -> acc.getNumero() == accountID)
					.findFirst()
					.get()
					);


				switch (option) {
					case 1 -> {
						accounts.get(accountIndex).depositar(amount);
						fallbackHistoryOfChanges.offer(String.format("Depósito a cuenta: %d\nCantidad:%.2f\n", accountID, amount));
						System.out.println("\nDepósito realizado correctamente.\n");
					} 
					case 2 -> {
						accounts.get(accountIndex).retirar(amount);
						fallbackHistoryOfChanges.offer(String.format("Retiro de cuenta: %d\nCantidad:%.2f\n", accountID, amount));
						System.out.println("\nRetiro realizado correctamente.\n");
					} 
					case 3 -> {
						System.out.printf("\nCuenta: %s\nSaldo actual: %.2f\n", accountID, accounts.get(accountIndex).getSaldo());
					}
				}

				
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error leyendo la entrada. Por favor, ingresa una opción válida.");
			}
		}

		try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Cuentas.dat"))) {
			oss.writeObject(accounts);
			System.out.println("Cambios guardados exitosamente.");
		} catch (IOException e) {
			System.err.println("No se han podido guardar los cambios realizados en las cuentas en el almacenamiento. Imprimiendo el historial de transacciones en consola:\n");
			fallbackHistoryOfChanges.stream().forEach(System.out::println);
		}

	} // End of main method. Just a reminder for myself.

	
	// I know I should never use SupressWarnings annotation, but again, I'm already handling the possible ClassNotFoundException
	// even tho Java keeps complaining that something can go brrr and break.
	//Not sure any other way I may "safely" cast from Object to List<Cuenta>
	@SuppressWarnings("unchecked")
	static List<Cuenta> retrieveAccounts() {
		List<Cuenta> accounts = null;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cuentas.dat"))) {
			accounts = (ArrayList<Cuenta>) ois.readObject();
			System.out.println("\nCuentas cargadas exitosamente.");
			
		} catch (IOException e) {
			System.err.println("El archivo no pudo ser leído. Asegúrate que Cuentas.dat exista en el almacenamiento.");
			
		} catch (ClassNotFoundException | ClassCastException e) {
			System.err.println("El archivo Cuentas.dat parece estar corrompido o contiene información inválida que no corresponde a Cuentas bancarias.");
		}
		
		return accounts; // Just return accounts. The main method will handle the possible case where accounts = null.
	}
}
