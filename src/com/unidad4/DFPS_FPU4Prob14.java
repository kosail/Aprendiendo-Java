// Leer 14 números enteros, almacenarlos en un vector y determinar cuántos datos dentro del vector son impares
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob14 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[14];
		byte counter=0;

		System.out.print("Ingresa 14 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if ((numbers[i]&1)!=0) {
				counter++;
			}
		}

		System.out.printf("Cantidad de números impares en el vector: %d",counter);
		br.close();
	}
}
