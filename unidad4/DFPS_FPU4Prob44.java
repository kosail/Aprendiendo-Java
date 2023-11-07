// Leer 7 números enteros, almacenarlos en un vector y determinar cuántos de los números almacenados en dicho vector pertenecen al rango de 100 a 900.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob44 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int threeDigitsCounter = 0;

		System.out.println("Ingresa 7 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]>100 && numbers[i]<900) {
				threeDigitsCounter++;
			}
		}
		System.out.println(threeDigitsCounter + " números");
		br.close();
	}
}