// Leer 12 números enteros, almacenarlos en un vector y determinar cuáles son los números múltiplos de 5 y en qué posiciones están.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob22 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[12];
		String positionsFiveMultipliers = "";

		System.out.println("Ingresa 12 números enteros, uno por uno:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]%5==0) {
				positionsFiveMultipliers = positionsFiveMultipliers.concat((i+1) + " "); // Añadiendo 1 para hacerlo más amigable con la forma de contar de los humanos.
			}
		}

		System.out.println("Multiplos de 5 encontrados en las posiciones: " + positionsFiveMultipliers);
		br.close();
	}
}
