package com.Actividad19.CajeroAutomatico;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CajeroAutomatico {
	public static void main(String[] args) throws InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stream<Cuenta> accounts = null;

		System.out.print("Cargando cuentas de \"Cuentas.dat\"");
		for (int i=0; i<3; i++) {
			System.out.print(".");
			Thread.sleep(800);
		}
		System.out.println("\n");
		
		Optional<List<Cuenta>> retrieve = retrieveAccounts();
		if (retrieve.isPresent()) {
			accounts = retrieve.get().stream();
		} else {
			System.err.println("Terminando la ejecución del programa por errores leyendo la información de las cuentas.");
			System.exit(1);
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

				System.out.print("Ingresa el número de la cuenta: ");
				Optional<Integer> accountIDExist = Optional.ofNullable(Integer.parseInt(br.readLine()));

				if (accountIDExist.isEmpty() || ! accounts.anyMatch((a) -> a.getNumero() == accountIDExist.get())) {
					System.err.println("\nLa cuenta indicada no existe.");
					continue;
				}

				System.out.print("Ingresa el monto: ");
				int amount = Integer.parseInt(br.readLine());

				if (amount < 0) {
					System.err.println("\nEl monto no es válido.");
					continue;
				}
				
				Cuenta account = accounts.filter(acc -> acc.getNumero() == accountIDExist.get()).findFirst().get();
				switch (option) {
					case 1 -> deposit.accept(account, accountIDExist.get());
					case 2 -> withdraw.accept(account, accountIDExist.get());
					case 3 -> balanceInquiry.apply(account);
					default -> System.err.println("\nHas ingresado una opción no válida. Por favor, intenta de nuevo.\n");
				}
				
			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error leyendo la entrada. Por favor, ingresa una opción válida.");
			}
		}



	}
	static BiConsumer<Cuenta, Integer> deposit = (acc, amount) -> acc.depositar(amount);

	static BiConsumer<Cuenta, Integer> withdraw = (acc, amount) -> acc.retirar(amount);

	static Function<Cuenta, Double> balanceInquiry = (acc) -> acc.getSaldo();

	@SuppressWarnings("unchecked")
	static Optional<List<Cuenta>> retrieveAccounts() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cuentas.dat"))) {
			List<Cuenta> accounts = (ArrayList<Cuenta>) ois.readObject();
			System.out.println("\nCuentas cargadas exitosamente.");
			
			return Optional.of(accounts);

		} catch (IOException e) {
			System.err.println("El archivo no pudo ser leído. Asegúrate que Cuentas.dat exista en el almacenamiento.");

		} catch (ClassNotFoundException | ClassCastException e) {
			System.err.println("El archivo Cuentas.dat parece estar corrompido o contiene información inválida que no corresponde a Cuentas bancarias.");
		}

		return Optional.empty();
	}
}
