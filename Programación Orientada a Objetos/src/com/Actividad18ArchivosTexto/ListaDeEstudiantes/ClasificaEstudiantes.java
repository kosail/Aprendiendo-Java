package com.Actividad18ArchivosTexto.ListaDeEstudiantes;

import java.io.*;

public class ClasificaEstudiantes {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Error: No se indicó ningún archivo de estudiantes.\n Uso: java ClasificaEstudiantes.java \"ruta/Estudiantes.txt\"");
			System.exit(1);
		}
		
		File studentsFile = new File(args[0]);

		if (! studentsFile.exists()) {
			System.err.println("El archivo no existe o no fue encontrado.");
			System.exit(2);
		}

		try ( BufferedReader br = new BufferedReader(new FileReader(studentsFile)) ) {
			BufferedWriter[] studentClassificator = {new BufferedWriter(new FileWriter("Foraneos.txt")), new BufferedWriter(new FileWriter("Locales.txt"))};

			int foreignersCounter = 0, nativesCounter = 0, foreignersAverage = 0, nativesAverage = 0;

			while (br.ready()) {
				String actualLine = br.readLine();
	
				if (actualLine.substring(0, 1).equals("F")) {
					studentClassificator[0].write(actualLine + "\n");
					foreignersCounter++;
					foreignersAverage += Integer.parseInt(actualLine.substring(actualLine.lastIndexOf(",") + 1));
				} else {
					studentClassificator[1].write(actualLine + "\n");
					nativesCounter++;
					nativesAverage += Integer.parseInt(actualLine.substring(actualLine.lastIndexOf(",") + 1));
				}
			}

			studentClassificator[0].write(String.format("Foraneos %d, promedio edad %d", foreignersCounter, foreignersAverage/foreignersCounter));
			studentClassificator[1].write(String.format("Locales %d: promedio edad %d",nativesCounter, nativesAverage/nativesCounter));

			for (int i=0; i<studentClassificator.length; i++) {
				studentClassificator[i].close();
			}

		} catch (IOException e) {
			System.err.println("Ha ocurrido un error leyendo el archivo.");
		}

		System.out.println("Estudiantes segmentados correctamente. Resultados impresos en los archivos Foraneos.txt y Locales.txt");
	}
}
