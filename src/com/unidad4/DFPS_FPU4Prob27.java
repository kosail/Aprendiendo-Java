// Leer 7 números enteros, almacenarlos en un vector y determinar a cuánto es igual el promedio entero de los números pares en el vector.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob27 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int sum=0, evenCounter=0;

		System.out.println("Ingresa 7 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if ((numbers[i]&1)==0) {
				sum+=numbers[i];
				evenCounter++;
			}
		}
		System.out.print("Promedio: " + sum/evenCounter);
		br.close();
	}
}