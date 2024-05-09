package com.ProyectoServicioMedico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.BiConsumer;

/*
! 6. Escribir una aplicación llamada “AgendaDeConsultas”. Que realice lo siguiente:
    * a) Esta aplicación debe leer los médicos y los pacientes de los respectivos archivos. 
    ! b) Deberá leer los datos del teclado necesarios para agendar una cita; Nombre del Paciente, Nombre del Médico y la fecha correspondiente (Mes, día y hora). Los datos se leen mientras el nombre del paciente sea diferente de <enter>.

    TODO: c) Generar un archivo con la información de la Agenda de Citas llamado “Consultas.dat”

    TODO: d) Dado un nombre de un médico (leerlo del teclado) generar un reporte con la información correspondiente a todas sus citas agendadas.
    
	TODO: e) Dado el nombre de un paciente reportar que médicos y en que fechas lo han consultado.
    
	TODO: f) Generar un listado con las consultas de un dia en particular. Solicitar el día desde el teclado.
 */

public class AgendaDeConsultas {
	public static void main(String[] args) {
		// Load the medics and patients information or if it fails, throw a RuntimeException to ensure the program will be halted.
		List<Medico> medics = retrieveMedicsData("Medicos.dat").orElseThrow(() -> new RuntimeException("Fallo en carga de información de los médicos."));
		List<Paciente> patients = retrievePatientsData("Pacientes.dat").orElseThrow(() -> new RuntimeException("Fallo en carga de información de los pacientes."));		
		List<Consulta> appointments = new ArrayList<Consulta>(50); // Initialize the appointments array with 50 elements

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Needed for IO of the user

		while (true) {
			int option = 0;

			try {
				option = menu(br, option);
				
				switch(option) { // Pattern matching will make things way easier for this specific case.
					case 1 -> createNewAppointment(br, medics, patients, appointments); // !Implementar
					case 2 -> exportAppointmentsToDisk(appointments); // !Implementar
					case 3 -> reportAppointmentPerMedic(appointments); // !Implementar
					case 4 -> reportAppointmentPerPatience(appointments); // !Implementar
					case 5 -> reportAppointmentsPerDay(appointments); // !Implementar
					default -> System.err.println("Has ingresado una opción no válida. Verifica la entrada que has proveído.\n");
				}

			} catch (IOException e) {
				System.err.println("Ha ocurrido un error de entrada o salida y no es posible interactuar con el usuario.\nCerrando sistema.\n");
				System.exit(1);

			} catch (NumberFormatException e) {
				System.err.println("Has ingresado una opción no válida. Verifica la entrada que has proveído.\n");
			}
		}

		System.out.println("Gracias por usar nuestro sistema de agendado de citas.");
	} // End of main method.

	static Optional<List<Medico>> retrieveMedicsData(String fileName) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			return Optional.of( (ArrayList<Medico>) ois.readObject() );			
		} catch (IOException e) {
			System.err.println("El archivo " + fileName + "  no pudo ser leído o no existe.");	
		} catch (ClassNotFoundException | ClassCastException e) {
			System.err.println("El archivo " + fileName + " parece estar corrupto. Asegúrate que contenga información válida de médicos.");	
		}
		
		return Optional.empty();
	}

	static Optional<List<Paciente>> retrievePatientsData(String fileName) {		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			return Optional.of((ArrayList<Paciente>) ois.readObject());			
		} catch (IOException e) {
			System.err.println("El archivo " + fileName + "  no pudo ser leído o no existe.");
		}  catch (ClassNotFoundException | ClassCastException e) {
			System.err.println("El archivo " + fileName + " parece estar corrupto. Asegúrate que contenga información válida de médicos.");	
		}
		
		return Optional.empty();
	}

	static int menu(BufferedReader br, int option) throws IOException, NumberFormatException {
		System.out.println("+---------------------------------+\n");
		System.out.println("Control de citas médicas (v2024.0.2)");
		System.out.println("+---------------------------------+\n");
		System.out.println("Selecciona una opción: ");
		System.out.print("\t1) Registrar citas nuevas\n\t2) Exportar todas las citas al almacenamiento.\n\t3) Reporte de citas pendientes por médico\n\t4) Historial de citas por paciente\n\t5) Busqueda de citas por día\n\n\t0) Salir\n\n>> ");
		
		return Integer.parseInt(br.readLine());
	}

	static void createNewAppointment(BufferedReader br, List<Medico> medics, List<Paciente> patients, List<Consulta> appointments) {
		System.out.print("Ingresa el nombre del médico con quien se agendará la cita.\nMédicos disponibles:\n");
		
		for (int i = 0; i<medics.size(); i++) { // Make the user select the desired medic from the available list to avoid typing errors from the user when searching for name or Medic ID
			System.out.printf("%d) %s\n", i + 1, medics.get(i).getNombre());
		}

		
	}

}
