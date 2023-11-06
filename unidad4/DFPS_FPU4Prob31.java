// Leer 10 números enteros, almacenarlos en un vector. Luego leer un entero y determinar cuántos divisores exactos tiene este último número entre los valores almacenados en el vector.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob31 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		int lastReadNumber = 0, divisorCounter=0;

		System.out.println("Ingresa 10 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Ingresa un número entero: ");
		lastReadNumber = Integer.parseInt(br.readLine());

		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]!=0 && lastReadNumber%numbers[i]==0) {
				divisorCounter++;
			}
		}

		System.out.printf("El número %d tiene %d divisores exactos en el vector.",lastReadNumber,divisorCounter);
		br.close();
	}
}