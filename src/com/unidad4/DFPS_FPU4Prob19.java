// Leer 9 números enteros, almacenarlos en un vector y determinar cuál es el número menor.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[9];
		int lowestNumber = 1;

		System.out.println("Ingresa 9 números enteros, uno por uno: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (lowestNumber>=numbers[i]) {
				lowestNumber = numbers[i];
			}
		}
		System.out.println("Número menor: " + lowestNumber);
		br.close();
	}
}
