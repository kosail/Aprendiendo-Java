// Leer 11 números enteros, almacenarlos en un vector y determinar en qué posición está el número cuya suma de dígitos sea la mayor.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob21 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[11];
		int quotient=0, sum = 0, HighestSum = 0, posHighestNum = 0;

		System.out.println("Ingresa 11 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			sum = 0;
			quotient = numbers[i];

			do {
				sum+= quotient%10;
				quotient = quotient/10;
			} while(quotient>0);

			if (sum>HighestSum) {
				HighestSum = sum;
				posHighestNum = i + 1; // añadiendo 1 para hacer el output más amigable para los humanos
			}
		}
		System.out.println("El número cuya suma de dígitos es la mayor está en la posición: " + posHighestNum);
		br.close();
	}
}