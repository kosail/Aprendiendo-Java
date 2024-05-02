package com.PracticaClasePersona;

import java.io.*;
import java.util.ArrayList;

public class RelacionDePersonas {
	public static void main(String[] args) {
		ArrayList<Persona> majors = personList("Mayores.dat");
		ArrayList<Persona> minors = personList("Menores.dat");
		Persona majorMostWeight = majors.get(0);

		if (majors != null && minors != null) {
			System.out.println("Personas mayores de edad:");
			System.out.println("-------------------------");
			
			for (int i=0; i<majors.size(); i++) {
				System.out.print(majors.get(i).toString() + "\t" + majors.get(i).calcularIMC() + "\n");
				
				if (majors.get(i).getPeso() > majorMostWeight.getPeso()) majorMostWeight = majors.get(i);
			}

			System.out.println("\nPersonas con IMC mayor a 30:");
			System.out.println("------------------------------");
			
			for (int i=0; i<majors.size(); i++) {
				if (majors.get(i).calcularIMC() > 30) {
					System.out.print(majors.get(i).toString() + "\n");
				}
			}

			System.out.println("\nPersona mayor de edad con mayor peso:");
			System.out.println("---------------------------------------");
			System.out.print(majorMostWeight.toString() + "\n");

			Persona minorLeastWeight = minors.get(0);
			System.out.println("\nPersonas menores de edad:");
			System.out.println("---------------------------");
			
			for (int i=0; i<minors.size(); i++) {
				System.out.print(minors.get(i).toString() + "\n");

				if (minors.get(i).getPeso() < minorLeastWeight.getPeso()) minorLeastWeight = majors.get(i);
			}

			System.out.println("\nPersonas menores de edad con altura mayor a 1.70 m");
			System.out.println("----------------------------------------------------");
			
			for (int i=0; i<minors.size(); i++) {
				if (minors.get(i).getAltura() > 1.70) {
					System.out.print(minors.get(i).toString() + "\n");
				}
			}

			System.out.println("\nPersona menor de edad con menor peso:");
			System.out.println("---------------------------------------");
			System.out.print(minorLeastWeight.toString() + "\n");
		}
	}
	
	public static ArrayList<Persona> personList(String personList) {
		try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(personList)) ) {
			Object objectFetched = ois.readObject();

			if (objectFetched instanceof ArrayList<?>) {
				return (ArrayList <Persona>) objectFetched;
			} else {
				System.err.println("El archivo " + personList + " no tiene el formato correcto, pues no contiene información de personas.");
			}

		} catch (IOException e) {
			System.err.println("Ha ocurrido un error recapturando la información del archivo " + personList + ". Asegúrate que los archivos de información estén presentes.");
		} catch (ClassNotFoundException e) {
			System.err.println("El archivo " + personList + " parece estar corrompido porque no pudo ser leído. Comprueba dichos archivos y reintenta.");
			System.err.println("Tipo de error: " + e.getMessage());
		}

		return null;
	}
}
