// Leer 6 números enteros, almacenarlos en un vector y determinar cuántos números terminan en 7.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob49 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[6];
		int digitCounter = 0;

		System.out.println("Ingresa 6 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (Math.abs(numbers[i])%10==7) {
				digitCounter++;
			}
		}
		System.out.println(digitCounter + " números terminan en 7.");
		br.close();
	}
}