// Leer 8 números enteros, almacenarlos en un vector y mostrar en pantalla todos los enteros comprendidos entre 1 y cada uno de los números almacenados en el vector.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob28 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];

		System.out.println("Ingresa 8 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		for (int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + ": ");

			if (numbers[i]>0) {
				for (int j=1;j<=numbers[i];j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j=numbers[i];j<=1;j++) {
					System.out.print(j + " ");
				}
			}

			System.out.println();
		}

		br.close();
	}
}
