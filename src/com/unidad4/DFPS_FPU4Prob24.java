// Leer 4 números enteros, almacenarlos en un vector y determinar en qué posición está el número con más dígitos, si hay varios números con la máxima cantidad de dígitos, mostrar todas las posiciones del arreglo que los contienen
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob24 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[4];
		int digits = 0, maxDigits=0;
		String maxDigitOccurances = "";

		System.out.println("Ingresa 4 números enteros, uno a la vez.");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			digits = (int) Math.floor(Math.log10(Math.abs(numbers[i])));
			if (i!=0 && digits>=maxDigits) {
				maxDigits = digits;
				maxDigitOccurances = maxDigitOccurances.concat((i+1) + " ");
			} else if (i==0) {
				maxDigits = digits;
			}
		}
		System.out.println("Posiciones de los números con más dígitos: " + maxDigitOccurances);
		br.close();
	}
}
