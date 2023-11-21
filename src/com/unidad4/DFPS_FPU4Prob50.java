// Leer 7 número enteros, almacenarlos en un vector y determinar cuántos números de los almacenados en dicho vector comienzan con el dígito 9.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob50 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int quotient = 0, counter = 0;

		System.out.println("Ingresa 7 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = Math.abs(numbers[i] = Integer.parseInt(br.readLine()));

			while (quotient>10) {
				quotient/=10;
			}

			if (quotient==9) {
				counter++;
			}
			
		}
		System.out.println(counter + " números.");
		br.close();
	}
}
