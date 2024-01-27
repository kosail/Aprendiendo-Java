// Leer 5 números enteros, almacenarlos en un vector y determinar cuántos de los números leídos son números terminados en 3.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob25 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[5];
		byte counter = 0;

		System.out.println("Ingresa 5 números enteros, uno a la vez.");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]%10==3) {
				counter++;
			}
		}
		System.out.println("Números terminados en 3: " + counter);
		br.close();
	}
}
