// Leer 10 números enteros, almacenarlos en un vector y determinar en qué posición se encuentra el número menor.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		int smallestNumber=0, positionSmallestNumber=0;

		try {
			System.out.println("Ingresa 10 números enteros, uno a la vez: ");
			for (int i=0;i<numbers.length;i++) {
				numbers[i] = Integer.parseInt(br.readLine());

				if (smallestNumber>numbers[i]) {
					smallestNumber = numbers[i];
					positionSmallestNumber = i;
				}
			}

		}catch (IOException e) {
			System.out.println("An error has ocurred: " + e.getMessage());
			System.out.println(e);
		}finally {
			br.close();
		}

		System.out.println("La posición del número más pequeño es: " + (positionSmallestNumber+1)); // Sumándole 1 al índice porque es más amigable con la forma de contar humana, que comienza en 1 y no en 0
	}
}
