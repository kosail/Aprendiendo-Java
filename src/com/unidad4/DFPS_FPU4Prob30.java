// Leer 10 números enteros, almacenarlos en un vector. Luego leer un entero y determinar si este último entero se encuentra entre los 10 valores almacenados en el vector.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob30 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		int lastReadNumber=0;
		boolean occurance = false;

		System.out.println("Ingresa 10 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Ingresa un número entero: ");
		lastReadNumber = Integer.parseInt(br.readLine());

		for (int i=0;i<numbers.length;i++) {
			if (lastReadNumber==numbers[i]) {
				occurance = true;
			}
		}

		if (occurance) {
				System.out.println("El número se encuentra en el vector.");
			} else {
				System.out.println("El número no se encontró en el vector.");
			}

		br.close();
	}
}
