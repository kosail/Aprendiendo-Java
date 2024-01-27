// Leer 8 números enteros, almacenarlos en un vector y determinar en qué posiciones están los números pares.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob18 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];
		String evensPositions = "";

		System.out.println("Ingresa 8 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if ((numbers[i]&1)==0) {
				evensPositions = evensPositions.concat((i+1) + " "); // Sumándole uno a la posición para hacer el output más friendly con los humanos
			}
		}
		
		System.out.println("Números pares avistados en las posiciones: " + evensPositions);
		br.close();
	}
}
