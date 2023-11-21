// Leer 5 números enteros, almacenarlos en un vector y determinar en qué posición se encuentra el número primo con mayor cantidad de dígitos pares.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob48 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[5];
		int quotient=0, currentDigits=0, highestDigits=0, positionHighestDigits=0;
		boolean isPrime = true;

		System.out.println("Ingresa 5 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = Math.abs(numbers[i] = Integer.parseInt(br.readLine()));

			if ((numbers[i]&1)!=0) {
				for (int j=2;j<numbers[i]/2;j++) {
					if (numbers[i]/j==0) {
						isPrime = false;
					}
				}
				
				if (isPrime) {
					currentDigits = 0;
					
					while (quotient>0) {
						quotient/=10;
						currentDigits++;
					}

					if (currentDigits%2==0 && currentDigits>highestDigits) {
						highestDigits = currentDigits;
						positionHighestDigits = i;
					}
				}
			}
		}
		System.out.println("Posición: " + positionHighestDigits);
		br.close();
	}
}
