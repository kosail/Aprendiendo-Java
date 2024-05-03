package com.Actividad19.AgendaElectronica;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class LeerContactos {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Contacto> contactList = new ArrayList<Contacto>();
		String tempName = "";

		System.out.println("\nRegistro de contactos");
		System.out.println("---------------------\n");
		
		do {
			System.out.print("Ingresa el nombre del contacto a registrar: ");
			
			try {
				tempName = br.readLine();
				
				if (tempName.equals("")) break;

				System.out.print("Número de teléfono: ");
				int telephone = Integer.parseInt(br.readLine());

				System.out.print("Dirección: ");
				String address = br.readLine();

				System.out.println("Fecha de cumpleaños (MMDD): ");
				int birthday = Integer.parseInt(br.readLine());

				Contacto contact = new Contacto(tempName, telephone, address, birthday);

				if (contact != null) {
					contactList.add(contact);
					System.out.println("\nContacto registrado exitosamente.\n");
				}

			} catch (IOException | NumberFormatException e) {
				System.err.println("Ha ocurrido un error leyendo los datos. Por favor, rectifica la entrada de datos.");
			}
		} while (! tempName.equals(""));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Contactos.dat"))) {
			if (contactList.size() > 0) {
				oos.writeObject(contactList);
				System.out.println("Contactos escritos en el disco duro con éxito.");
			} else {
				System.err.println("No se han registrado contactos los cuales escribir en disco.");
			}
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error escribiendo los contactos al disco duro.\nInformación sobre el error:");
			e.printStackTrace();
		}
	}
}
