// Leer 6 números enteros, almacenarlos en un vector y calcular el factorial a cada uno de los números leídos almacenándolos en otro vector.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob26 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[6];
		long[] factorial = new long[6];
		
		// Rellenando todo el vector de 1 para que el vectorial pueda ejecutarse, porque de lo contrario inicia en 0, y va a multiplicar todo por 0.
		for (int i=0;i<numbers.length;i++) {
			factorial[i] = 1;
		}

		System.out.println("Ingresa 6 números enteros, uno a la vez.");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			// Inicializando en 1 para que no multiplique por 0 y mate todo, y j<= para que se ejecute la cantidad exacta del número, en lugar de 1 menos.
			for (int j=1;j<=numbers[i];j++) {
				factorial[i]*=j;
			}
		}

		for (int i=0;i<numbers.length;i++) {
			System.out.printf("Factorial de %d: %s\n", numbers[i], factorial[i]);
		}
		br.close();
	}
}