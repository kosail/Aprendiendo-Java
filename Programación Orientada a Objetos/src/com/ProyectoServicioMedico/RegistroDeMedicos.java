package com.ProyectoServicioMedico;

// Imports for interaction with the user
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Imports for serialization of the Medics information to Objects and .txt
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

// Import for easy manage and track of the Medic objects
import java.util.List;
import java.util.ArrayList;

public class RegistroDeMedicos {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Medico> medicsRegistered = new ArrayList<>(); // We'll use an ArrayList to store the Medico objects.
		
		System.out.println("Sistema de registro de médicos V0.1");
		System.out.println("+---------------------------------+\n");
		
		int medicID = 0;
		do {
			try {
				System.out.println("\tRegistro nuevo\n");
				System.out.println("+---------------------------------+\n");

				System.out.print("Ingresa el número de cédula: ");
				medicID = Integer.parseInt(br.readLine());

				if (medicID == 0) break;

				/*Functional methods like anyMatch or filter requires the comparation to be performed in a immutable way, such that the medicID CANNOT change during the loops or all will go brrr. Thus, anyMatch DEMANDS the medicID to be a local variable or to be final.
				This can be easily performed using an AtomicInteger object, but that seems overkill for the purpose. Let's just create a simple copy of medicID called localMedicID. */
				int localMedicID = medicID;

				if (medicsRegistered.stream().anyMatch((med) -> med.getCedula() == localMedicID)) { // Check if there is any match about Medic objects having the same medicID the user is trying to add
					String medicHoldingTheExistingID = medicsRegistered.stream()
					.filter((med) -> med.getCedula() == localMedicID)
					.map(Medico::getNombre)
					.findFirst().get(); // Get the name of the Medic that already has the ID that the user is trying to add

					System.err.println("El número de cédula ya está registrado a nombre de: " + medicHoldingTheExistingID);
					System.out.println("+---------------------------------+\n");
					continue; // Skip this iteration. It does not make sense to continue as Medic IDs should be unique.
				}

				System.out.print("Nombre del médico: ");
				String medicName = br.readLine();


				if (medicsRegistered.add(new Medico(medicID, medicName))) {
					System.out.println("\nMédico registrado correctamente.\n");
				} else {
					System.out.println("\nNo se ha podido registrar al médico debido a un error interno. Verifica que los dados que has proveído no tienen errores.\n");
				}

				System.out.println("+---------------------------------+\n");

			} catch (IOException | NumberFormatException e) {
				System.err.println("\nHa ocurrido un error capturando la información del médico. Vuelve a ingresarla.\n");
			}

		} while(medicID != 0);

		if (medicsRegistered.size() == 0) {
			System.err.println("No se registró información sobre ningún médico.\nSaliendo del programa.");
			System.exit(1);
		}

		System.out.println("Registro de médicos guardado exitosamente.\n");
		System.out.println("Exportando información de médicos al almacenamiento del PC...");

		// Writing the medic objects information using separated try-catch blocks, because if one of them fails it will not affect the other.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Medicos.dat"))) {
			oos.writeObject(medicsRegistered);
			System.out.println("Medicos.dat guardado exitosamente.");
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error escribiendo el registro de médicos a Medicos.dat");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Medicos.txt"))) {
			medicsRegistered.stream()
			.forEach(med -> {
				try {
					bw.write(med.toString() + "\n");
				} catch (IOException e) {
					System.err.println("Ha ocurrido un error escribiendo el registro de médicos a Medicos.txt");
				}
			});

			System.out.println("Medicos.txt guardado exitosamente.");
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error escribiendo el registro de médicos a Medicos.txt");
		}
	}
}
