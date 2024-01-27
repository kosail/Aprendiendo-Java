// Leer 7 números enteros, almacenarlos en un vector y determinar cuántos números negativos hay.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob17 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		byte counter=0;

		System.out.println("Ingresa 7 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i] < 0) {
				counter++;
			}
		}
		System.out.printf("Hay %d números negativos.",counter);
		br.close();
		}
} 
