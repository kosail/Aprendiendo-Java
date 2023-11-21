// Leer 13 números enteros, almacenarlos en un vector y determinar si el promedio entero de estos datos está almacenado en el vector.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[13];
		int average = 0;
		boolean averageSpotted = false;

		System.out.print("Ingresa 13 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			average+=numbers[i];
		}

		average = (int) average/numbers.length;
		for (int i=0;i<numbers.length;i++) {
			if (average == numbers[i]) {
				averageSpotted = true;
			}
		}

		if (averageSpotted) {
			System.out.println("El promedio entero de estos datos está almacenado en el vector.");
		} else {
			System.out.println("El promedio entero de estos datos NO está presente en el vector.");
		}

		br.close();
	}
}
