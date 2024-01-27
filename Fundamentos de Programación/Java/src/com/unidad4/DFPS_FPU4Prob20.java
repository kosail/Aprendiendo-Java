// Leer 10 números enteros, almacenarlos en un vector y determinar en qué posición está el menor número primo.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob20 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		int lowestNumber=1, positionLowestNumber=0;
		boolean isPrime;

		System.out.println("Ingresa 10 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		
			isPrime = true;
			if ((numbers[i]&1)!=0) {
				for (int j=2;j<numbers[i]/2;j++) {
					if (numbers[i]%j==0) {
						isPrime = false;
						break;
					}
				}

				if (lowestNumber>=numbers[i] && isPrime) {
					lowestNumber = numbers[i];
					positionLowestNumber = i + 1; // Añadiendo 1 para que el output sea más comprensible para los humanos.
				}
			}
		}
		System.out.println("Posición del menor número primo: " + positionLowestNumber);
		br.close();
	}
}
