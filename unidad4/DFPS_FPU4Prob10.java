// Leer 10 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran los números con más de 3 dígitos.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		int numberOfDigits = 0;
		String digitsPositions = "";

		System.out.print("Ingresa 10 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			numberOfDigits = (int) Math.floor(Math.log10(Math.abs(numbers[i]))) + 1;

			if(numberOfDigits>=3) {
				digitsPositions = digitsPositions.concat((i + 1)+ " "); // Se le añade uno para que el output sea más amigable con los humanos, que cuentan empezando en 1.
			}
		}

		System.out.printf("Los dígitos con 3 o más dígitos se encuentran en las posiciones: %s", digitsPositions);

		br.close();
	}
}