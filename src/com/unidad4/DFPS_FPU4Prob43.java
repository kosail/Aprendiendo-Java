//  Leer 8 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran números primos.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob43 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];
		boolean isPrime=true;
		String primePositions = "";

		System.out.println("Ingresa 8 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]%2!=0) {
				for (int j=2;j<numbers[i]/2;j++) {
					if (numbers[i]%j==0) {
						isPrime = false;
					}
				}

				if (isPrime) {
					primePositions = primePositions.concat((i + 1) + " ");
				}
			}
		}
		System.out.println("Posiciones de primos: " + primePositions);
		br.close();
	}
}
