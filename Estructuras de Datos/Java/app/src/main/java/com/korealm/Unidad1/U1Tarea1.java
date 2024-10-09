package com.korealm.Unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.IOException;

public class U1Tarea1 {
	public static void main(String[] args) {
		System.out.println("╔════════════════════════╗");
		System.out.println("║   Sistema de equipos   ║");
		System.out.println("╚════════════════════════╝");

		System.out.println("Inicializando sistema...");

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			// Using a list even tho it is overkill for the purpose, because in this way I can just do a stream directly, map and get the higher score team
			List<Equipo> listOfTeams = new ArrayList<>();
			listOfTeams.add(new Equipo());
			listOfTeams.add(new Equipo("Leones", 'C', 13, 7));

			System.out.print("Ingresa el nombre del equipo: ");
			String name = br.readLine();

			System.out.print("Ingresa la división:\n(Un solo caracter, ej. A, B o C)\n>> ");
			char div = br.readLine().charAt(0);

			System.out.print("Ingresa la cantidad de jugadores: ");
			int players = Integer.parseInt(br.readLine());

			System.out.print("Ingresa la cantidad de puntos: ");
			int score = Integer.parseInt(br.readLine());

			listOfTeams.add(new Equipo(name, div, players, score));

			System.out.println("║──────────────────────────║");
			System.out.println("Procesando la información...");
			System.out.println("║──────────────────────────║");


			System.out.println("╔════════════════════════╗");
			System.out.println("║       Resultados       ║");
			System.out.println("╚════════════════════════╝");

			// Print'em all using streams
			listOfTeams.forEach(System.out::println);
			
			// Get the max score team using the max function
			Equipo highestScoreTeam = listOfTeams.stream()
                    .max(Comparator.comparingInt(Equipo::getPuntos)).get();

            // Display the highest scoring team
			System.out.println("El equipo con la puntuación más alta es: " + highestScoreTeam.getNombre());

		
		} catch (IOException | NumberFormatException e) {
			System.err.println("Ha ocurrido un error procesando la información, reintenta de nuevo!");
		}
	}
}
