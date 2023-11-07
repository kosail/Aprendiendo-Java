// Leer 9 números enteros, almacenarlos en un vector y determinar cuántos números de los almacenados en dicho vector terminan en 15.

package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob40 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[9];
		int counter=0;

		System.out.println("Ingresa 9 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		for (int i=0;i<numbers.length;i++) {
			if (Math.abs(numbers[i]%100)==15) {
				counter++;
			}
		}

		System.out.printf("Hay %d números que terminan en 15.\n",counter);
		br.close();
	}
}