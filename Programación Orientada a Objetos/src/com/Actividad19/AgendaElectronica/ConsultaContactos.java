package com.Actividad19.AgendaElectronica;

import java.io.*;
import java.util.*;

public class ConsultaContactos {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Contacto> contactList = new ArrayList<Contacto>();
		System.out.println("Leyendo contactos del disco duro...");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Contactos.dat"))) {
			contactList = (ArrayList<Contacto>) ois.readObject();
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error leyendo el archivo.");
			e.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException | ClassCastException e) {
			System.err.println("El archivo Contactos.dat parece estar corrompido. Rectifica que el archivo contiene información válida y reintenta.");
			System.exit(2);
		}

		System.out.println("Contactos cargados exitosamente.\n");

		// Storing the same List but in reversed order so it would be much much easier to retrieve the last contacts that matches with the letter given by the user.
		// I get this is by far a stupid decision in terms of performance (since in worst case scenario this would be like O(n)), and also in code legibility. But ma bro... I'm trying to learn functional programming and Stream's usage in Java.
		// TODO: Note for myself: check this code in the future and make sure if this cannot be done in a more friendly and efficient way.
		System.out.println("Optimizando base de datos...");
		List<Contacto> reverseSortedContacts = contactList;
		Collections.reverse(reverseSortedContacts);
		System.out.println("Base de datos optimizada.\n");

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String optionRead = "";
		do {
			System.out.print("\n\n¿Qué busqueda quieres realizar?\nPor ejemplo:\n" +
			"F#  // Muestra el primer contacto que inicie con F\n" +
			"F*  // Muestra todos los contactos que inician con F\n" +
			"F$  // Muestra el último contacto que inicia con F" + "\n\n>> "
			);
	
			try {
				optionRead = br.readLine();
			} catch (IOException e) {
				System.err.println("Ha ocurrido un error leyendo la orden que has ingresado. Intenta de nuevo.");
			}

			if (optionRead.equals("")) break;

			if (optionRead.length() != 2) {
				System.err.println("Error en la lectura de la orden que ingresaste.\nIngresa una letra seguido de un caracter #, * o $.\n");
				continue;
			}

			String letterToFind = optionRead.substring(0, 1);
			String wildcard = optionRead.substring(1);

			if (wildcard.equals("#")) {
				Optional<Contacto> occcurrence = contactList.stream()
				.filter(contact -> contact.getNombre().startsWith(letterToFind))
				.findFirst();

				if (occcurrence.isPresent()) System.out.println(occcurrence.get().toString() + "\n");
			}

			if (wildcard.equals("*")) {
				contactList.stream()
				.filter(contact -> contact.getNombre().startsWith(letterToFind))
				.forEach(System.out::println);
			}

			if (wildcard.equals("$")) {
				Optional<Contacto> occurrence = reverseSortedContacts.stream()
				.filter(contact -> contact.getNombre().startsWith(letterToFind))
				.findFirst();

				if (occurrence.isPresent()) System.out.println(occurrence.get().toString());
			}

		} while (! optionRead.equals(""));
	}
}
