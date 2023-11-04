// Leer 11 números enteros, almacenarlos en un vector y determinar cuántos números en el vector tienen menos de 3 dígitos.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[11];
		int numberOfDigits = 0;
		byte counter=0;

		System.out.print("Ingresa 11 números enteros, uno a la vez: ");
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			numberOfDigits = (int) Math.floor(Math.log10(Math.abs(numbers[i]))) + 1;

			if (numberOfDigits < 3) {
				counter++;
			}
		}
		System.out.printf("%d números tienen menos de 3 dígitos.\n", counter);
		br.close();
	}
}