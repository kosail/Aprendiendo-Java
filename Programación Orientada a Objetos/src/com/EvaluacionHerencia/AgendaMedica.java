import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class AgendaMedica {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Medico> medics = new ArrayList<>();

		// Capturar información de médicos y guardarlos en el array
		while (true) {
			System.out.print("\nIngresa el ID del médico a registrar: \n(Ingresa 0 para salir)\n\n>> ");

			try {
				int medicID = Integer.parseInt(br.readLine());
				if (medicID == 0) break;

				System.out.print("Ingresa el nombre del médico: ");
				String name = br.readLine();

				System.out.print("¿Médico familiar o médico cirujano?\n\t1) Cirujano\n\t2) Familiar\n\n>> ");
				int typeOfMedicSelected = Integer.parseInt(br.readLine());

				if (typeOfMedicSelected == 1) {
					System.out.print("Ingresa el número de quirofano: ");
					int quir = Integer.parseInt(br.readLine());

					System.out.print("Ingresa el número de cirugias: ");
					int ncir = Integer.parseInt(br.readLine());

					medics.add(new Cirujano(medicID, name, quir, ncir));

				} else if (typeOfMedicSelected == 2) {
					System.out.print("Ingresa número de consultorio: ");
					int consult = Integer.parseInt(br.readLine());

					System.out.print("Número de pacientes: ");
					int npaci = Integer.parseInt(br.readLine());

					medics.add(new Familiar(medicID, name, consult, npaci));

				} else {
					System.err.println("Tipo de médico no válido. Registro anulado.");
					continue;
				}

			} catch (IOException e) {
				System.err.println("Ha ocurrido un error de entrada o salida y no es posible interactuar con el usuario.\nCerrando sistema.\n");
				break;

			} catch (NumberFormatException e) {
				System.err.println("Has ingresado una opción no válida. Verifica la entrada que has proveído.\n");
			}
		}

		// Si no se registró ningún médico, no tiene sentido seguir, por lo es mejor terminar el programa. En lugar de System.exit, prefiero usar return para devolvere el control a la JVM.
		if (medics.size() == 0) return;

		// Imprimir la información de los Cirujanos con menos cirugías... pero la rúbrica no menciona en base a qué o a cuántas considerar "pocas" cirugias. Se podría considerar el que más tenga cirugias como la máxima, y la mitad de esas como "pocas", pero ¿si el que más cirugias tiene, tiene solo 3 o 2? De cualquier manera, parece el acercamiento más lógico al problema en lugar de solo imprimir todos los Cirujanos que tengan menos cirugias que el que más tiene.
		// Se procederá a imprimir la información de todos los Cirujanos que tengan menos de la mitad de cirugias, que el Cirujano con más cirujias registradas.

		// Para facilitarnos las cosas, vamos a filtrar todos los cirujanos del array de médicos, y de paso los guardamos ordenados de mayor a menor número de cirugias.
		List<Cirujano> surgeons = medics.stream()
			.filter(m -> m instanceof Cirujano)
			.map(m -> (Cirujano) m)
			.sorted((m1, m2) -> Integer.compare(m1.getCirugias(), m2.getCirugias()))
			.collect(Collectors.toList());

		// Imprimir médicos con número de cirugias menores a la mitad del que más tenga, o sea mostSurgeriesNumber / 2
		// Si no hay cirujanos, imprime que no hay cirujanos. Si solo hay 1, dado que no podemos asegurar si ese único tenga muchas o pocas, imprimirlo e indicar eso mismo.
		
		if (surgeons.isEmpty()) {
			System.out.println("No hay cirujanos registrados, por lo que no hay cirujanos con menor número de cirugias.\n");

		} else if (surgeons.size() == 1) {
			System.out.print("\n Solo hay 1 cirujano registrado, y su número de cirugías es: " + surgeons.get(0).getCirugias());
			System.out.println("Info del Cirujano:\n" + surgeons.get(0).toString());
			
		} else {
			int mostSurgeriesNumber = surgeons.get(surgeons.size() - 1).getCirugias();
			List<Cirujano> lowSurgeriesList = surgeons.stream().filter(s -> s.getCirugias() <= mostSurgeriesNumber / 2).collect(Collectors.toList());
	
			if (lowSurgeriesList.isEmpty()) {
				System.out.println("No hay médicos con menos de la mitad de las cirugias programadas para el Cirujano con más citas.");
				
				Cirujano lastSurg = surgeons.get(0);
				System.out.println("En su lugar, se mostrará la información del Cirujano con el menor número de cirugias registradas, que es de " + lastSurg.getCirugias() );
				System.out.println(String.format("Info del cirujano: %s\n%s\n\n", lastSurg.getNombre(), lastSurg.toString()));
			
			} else {
				System.out.println("Cirujanos con menor cantidad de cirugias:");
				lowSurgeriesList.stream().map(s -> s.toString()).forEach(System.out::println);;
			}
			
		}

		// Imprimir el médico familiar on más pacientes atendidos
		// Vamos a usar un Optional que me va a guardar el máximo de los médicos familiares en términos de pacientes. Si no hay médicos familiares registrados, deberá devolver cero. No estoy seguro si la función max() devuelve un Optional.of() o un Optional.ofNullable()... pero espero no explote con NullPointerExceptions.
		Optional<Familiar> mostUsefulDoctor = medics.stream()
		.filter(m -> m instanceof Familiar)
		.map(m -> (Familiar) m)
		.max((m1, m2) -> Integer.compare(m1.getPacientes(), m2.getPacientes()));

		if (mostUsefulDoctor.isEmpty()) {
			System.out.println("No hay médicos familiares registrados.\n");

		} else {
			System.out.println("\nEl médico familiar con mayor consultas es: " + mostUsefulDoctor.get().getNombre());
			System.out.println("Cantidad de consultas: " + mostUsefulDoctor.get().getPacientes());
			System.out.println("\nInfo completa del Médico familiar:");
			System.out.println(mostUsefulDoctor.get().toString() + "\n");
		}


		// Imprimir la información del médico que trabajó más durante la semana
		System.out.println("Médico con mayor cantidad de horas trabajadas:");
		System.out.println(medics.stream()
			.max((m1, m2) -> Double.compare(m1.calcularTiempo(), m2.calcularTiempo()))
			.get().toString()
		);

		
	}




}
