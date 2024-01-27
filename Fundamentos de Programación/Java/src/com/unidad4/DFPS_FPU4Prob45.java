// Leer 6 números enteros, almacenarlos en un vector y determinar cuántos números de los almacenados en dicho vector comienzan por 34.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob45 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int quotient=0, counter = 0;

		System.out.println("Ingresa 7 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = Math.abs(numbers[i] = Integer.parseInt(br.readLine()));

			while (((int) Math.floor(Math.log10(quotient)) + 1)>2) {
				quotient /=10;
			}

			if (quotient==34) {
				counter++;
			}
		}

		System.out.println(counter + " números comienzan con 34.");
		br.close();
	}
}
