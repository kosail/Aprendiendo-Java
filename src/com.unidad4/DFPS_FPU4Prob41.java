// Leer 10 números enteros, almacenarlos en un vector y determinar cuántos números de los almacenados en dicho vector comienzan con 3.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob41 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		int mostSignificantDigit=0, numThreeCounter=0;
		double logarithmOfNumber=0;

		System.out.println("Ingresa 10 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		for (int i=0;i<numbers.length;i++) {
			logarithmOfNumber = Math.log10(Math.abs(numbers[i]));
			logarithmOfNumber-= Math.floor(logarithmOfNumber);
			mostSignificantDigit = (int) Math.pow(10, logarithmOfNumber);
			
			if (mostSignificantDigit==3) {
				numThreeCounter++;
			}
		}

		System.out.printf("Hay %d números que comienzan en 3.", numThreeCounter);
		br.close();
	}
}